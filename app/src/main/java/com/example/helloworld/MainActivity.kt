package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //create a button
        val mBtnTextView = findViewById<Button>(R.id.btn_textview)
        //add a click listener to the button

        val tecx = findViewById<LinearLayout>(R.id.ll_main_layout)
        val tv_dynamic = TextView(this)
        tv_dynamic.textSize = 20f
        tv_dynamic.text = "安卓就尼玛离谱"

        tecx.addView(tv_dynamic);


        val mBtnButton = findViewById<Button>(R.id.btn_button)


        val mBtnEditText = findViewById<Button>(R.id.btn_button3)

        val mBtnRadioButton = findViewById<Button>(R.id.radiobutton)

        val mBtnCheckBox = findViewById<Button>(R.id.checkbox)

        val mBtnImageView = findViewById<Button>(R.id.imageview)
        class OnClick : View.OnClickListener {
            override fun onClick(v: View?) {
                when (v?.id) {
                    R.id.btn_textview -> {
                        val intent = Intent(this@MainActivity, TextActivity::class.java)
                        startActivity(intent)
                    }
                    R.id.btn_button -> {
                        val intent = Intent(this@MainActivity, ButtonActivity::class.java)
                        startActivity(intent)
                    }
                    R.id.btn_button3 -> {
                        val intent = Intent(this@MainActivity, EditTextActivity::class.java)
                        startActivity(intent)
                    }
                    R.id.radiobutton -> {
                        val intent = Intent(this@MainActivity, RadioButtonActivity::class.java)
                        startActivity(intent)
                    }
                    R.id.checkbox -> {
                        val intent = Intent(this@MainActivity, CheckBoxActivity::class.java)
                        startActivity(intent)
                    }
                    R.id.imageview -> {
                        val intent = Intent(this@MainActivity, ImageViewActivity::class.java)
                        startActivity(intent)
                    }
                }
            }
        }

        fun setListener() {
            val mOnClick = OnClick()
            mBtnTextView.setOnClickListener(mOnClick)
            mBtnButton.setOnClickListener(mOnClick)
            mBtnEditText.setOnClickListener(mOnClick)
            mBtnRadioButton.setOnClickListener(mOnClick)
            mBtnCheckBox.setOnClickListener(mOnClick)
            mBtnImageView.setOnClickListener(mOnClick)
        }
        setListener()
    }
}
