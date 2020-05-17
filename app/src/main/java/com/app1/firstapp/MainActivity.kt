package com.app1.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var submit = findViewById<Button>(R.id.submitBtn)
        var userTitle = findViewById<EditText>(R.id.userTitle)
        var userDesc = findViewById<EditText>(R.id.userDesc)
        //var showText = findViewById<TextView>(R.id.userD)



        submit.setOnClickListener {

            var title = userTitle.text.toString()
            var desc = userDesc.text.toString()


            var intent = Intent(this, PostActivity::class.java )
            intent.putExtra("title", title)
            intent.putExtra("desc", desc)
            startActivity(intent)



        }
    }
}
