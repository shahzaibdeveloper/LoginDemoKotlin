package com.android.afaqtechnologies.logindemokotlin

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import com.android.afaqtechnologies.logindemokotlin.Db.AppDb
import com.android.afaqtechnologies.logindemokotlin.Db.Emp_entity

class RoomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)

        var db = Room.databaseBuilder(applicationContext,AppDb::class.java,"EmployeeDb").build()



        Thread{


            var emp = Emp_entity()


            emp.emp_name = "shahzaib mehmood"
            emp.emp_post = "android developer"

            db.empDao().save_Emp(emp)
            db.empDao().readEmp().forEach {
                Log.i("TAG","id${it.id}")
                Log.i("TAG","emp_name${it.emp_name}")
                Log.i("TAG","emp_post${it.emp_post}")


            }


        }.start()


    }
}
