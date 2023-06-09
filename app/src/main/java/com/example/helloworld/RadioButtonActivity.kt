package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class RadioButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)

        val mRg1 = findViewById<RadioGroup>(R.id.rg_1)
        mRg1.setOnCheckedChangeListener { group, checkedId ->
            val mRb1 = findViewById<RadioButton>(checkedId)
            Toast.makeText(this, "你选择了${mRb1.text}", Toast.LENGTH_SHORT).show()
        }
    }
}