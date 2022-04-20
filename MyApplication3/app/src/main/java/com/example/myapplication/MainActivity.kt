package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener()
        {

            Log.d("TAG", "button 1 clicked")

            Toast.makeText(this,"button 1 clicked", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }


    }


}
