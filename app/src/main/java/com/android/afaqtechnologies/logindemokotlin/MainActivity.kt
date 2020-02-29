package com.android.afaqtechnologies.logindemokotlin

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var token = getSharedPreferences("username",Context.MODE_PRIVATE)


        if (token.getString("loginusername"," ")!= " ")
        {
            var intent = Intent(this,DashBoardActivity::class.java)
            startActivity(intent)
            finish()
        }



        login.setOnClickListener{
            var user =  email.text.toString()
            var password = pass.text.toString()



            if (user !=" " && password != " ")
            {
                val intent = Intent(this@MainActivity,DashBoardActivity::class.java)


                var editor = token.edit()
                editor.putString("loginusername",user)
                editor.commit()
                startActivity(intent)
            }


        }
    }
}
