package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast

class CheckBoxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)

    val mCb1 = findViewById<CheckBox>(R.id.cb_1)
    val mCb2 = findViewById<CheckBox>(R.id.cb_2)
        mCb1.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "你选择了${mCb1.text}", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "你取消了${mCb1.text}", Toast.LENGTH_SHORT).show()
            }
        }
        mCb2.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "你选择了${mCb2.text}", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "你取消了${mCb2.text}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}