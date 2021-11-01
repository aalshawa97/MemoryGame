package com.example.memorygame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.*

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    private lateinit var buttons: List<ImageButton>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttons = listOf(imageButton10, imageButton2, imageButton11, imageButton12, imageButton13, imageButton14, imageButton15, imageButton16)
        for(button in buttons)
        {
            button.setOnClickListener{
                Log.i(TAG, "button clicked!")
            }
        }
    }
}