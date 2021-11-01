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

        buttons = listOf()
        imageButton2.setOnClickListener{
            Log.i(TAG, "button clicked!")
        }
    }
}