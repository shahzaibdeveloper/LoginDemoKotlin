package com.android.afaqtechnologies.logindemokotlin

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dash_board.*

class DashBoardActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)
        var token = getSharedPreferences("username",Context.MODE_PRIVATE)
        username.text = token.getString("loginusername"," ")

        logout.setOnClickListener{
            var editor = token.edit()
            editor.putString("loginusername"," ")
            editor.commit()

            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
             finish()

        }
    }
}
