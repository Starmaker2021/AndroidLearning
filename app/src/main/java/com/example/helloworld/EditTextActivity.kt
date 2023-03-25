package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class EditTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)

        val mbtnlogin = findViewById<Button>(R.id.btn_login)
        mbtnlogin.setOnClickListener {
            Toast.makeText(this, "登陆成功", Toast.LENGTH_SHORT).show()
        }
        val mbtnusername = findViewById<EditText>(R.id.et_1)
        mbtnusername.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                //输入文本之前的状态
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.d("edittext", s.toString())
            }

            override fun afterTextChanged(s: Editable?) {
                //输入文字后的状态
            }
        })



    }


}