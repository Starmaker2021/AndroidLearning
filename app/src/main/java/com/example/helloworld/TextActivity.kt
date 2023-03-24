package com.example.helloworld

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text)

        val text1 = findViewById<TextView>(R.id.tv_text1)
        text1.setTypeface(null,Typeface.BOLD_ITALIC)

        val text2 = findViewById<TextView>(R.id.tv_text2)
        text2.isSelected = true;
    }
}