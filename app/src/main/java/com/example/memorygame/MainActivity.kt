package com.example.memorygame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.*
import com.example.memorygame.R.drawable;

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    private lateinit var buttons: List<ImageButton>
    private lateinit var cards: List<MemoryCard>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = mutableListOf(drawable.ic_blue_lightning, drawable.ic_code, drawable.ic_heart, drawable.ic_lightning, drawable.ic_plane, drawable.ic_smiley)
        //Add each image twice so we can create pairs
        images.addAll(images)
        //Randomize the order of images
        images.shuffle()
        buttons = listOf(imageButton10, imageButton2, imageButton11, imageButton12, imageButton13, imageButton14, imageButton15, imageButton16)
        cards = buttons.indices.map { index->
            MemoryCard(images[index])
        }
        buttons.forEachIndexed{index, button ->
            button.setOnClickListener{
                Log.i(TAG, "button clicked!")
                //Update models
                updateModels(index)
                //Update the UI for the game
                updateViews()
            }
        }
    }

    private fun updateViews() {
        cards.forEachIndexed { index, card ->
            val button = buttons[index]
            button.setImageResource(if (card.isFaceUp) card.identifier else drawable.ic_code)
        }
    }

    private fun updateModels(position: Int) {
        val card = cards[position]
        card.isFaceUp = !card.isFaceUp
    }
}