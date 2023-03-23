package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv_dynamic = TextView(this)
        tv_dynamic.textSize = 20f
        tv_dynamic.text = "安卓就尼玛离谱"
//创建一个按钮
        val mBtnTextView = findViewById<Button>(R.id.btn_textview)


        val tecx = findViewById<LinearLayout>(R.id.ll_main_layout)
        tecx.addView(tv_dynamic);

    }
}