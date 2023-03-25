package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class ButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)

        val btnShow = findViewById<Button>(R.id.btn_3)
        btnShow?.setOnClickListener{Toast.makeText(this, "你点击了按钮", Toast.LENGTH_SHORT).show()}

        val btn2 = findViewById<Button>(R.id.btn_2)
        btn2?.setOnClickListener{Toast.makeText(this, "你点击了按钮", Toast.LENGTH_SHORT).show()}
    }
    }


