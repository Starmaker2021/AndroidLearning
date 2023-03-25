package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //create a button
        val mBtnTextView = findViewById<Button>(R.id.btn_textview)
        //add a click listener to the button
        mBtnTextView?.setOnClickListener {
            val intent = Intent(this, TextActivity::class.java)
            startActivity(intent)
        }

        val tecx = findViewById<LinearLayout>(R.id.ll_main_layout)
        val tv_dynamic = TextView(this)
        tv_dynamic.textSize = 20f
        tv_dynamic.text = "安卓就尼玛离谱"

        tecx.addView(tv_dynamic);

        val mBtnButton = findViewById<Button>(R.id.btn_button)
        mBtnButton?.setOnClickListener {
            val intent = Intent(this, ButtonActivity::class.java)
            startActivity(intent)
        }

        val mBtnEditText = findViewById<Button>(R.id.btn_button3)
        mBtnEditText?.setOnClickListener {
            val intent = Intent(this, EditTextActivity::class.java)
            startActivity(intent)
        }


    }
}
