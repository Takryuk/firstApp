package com.app1.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_post.*
import org.w3c.dom.Text

class PostActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)

        var showTitle = findViewById<TextView>(R.id.showTitle)
        var showDesc = findViewById<TextView>(R.id.showDesc)

        var title = intent.getStringExtra("title")
        var desc = intent.getStringExtra("desc")

        showTitle.text = title
        showDesc.text = desc


        gobackBTN.setOnClickListener{
            startActivity(Intent( this, MainActivity::class.java))
        }




    }
}
