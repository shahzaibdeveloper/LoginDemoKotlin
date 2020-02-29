package com.android.afaqtechnologies.logindemokotlin.Db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
class Emp_entity {


    @PrimaryKey
    var id: Int = 0

    @ColumnInfo(name = "EMP_NAME")
    var emp_name: String = ""

     @ColumnInfo(name = "EMP_POST")
    var emp_post : String = ""



}