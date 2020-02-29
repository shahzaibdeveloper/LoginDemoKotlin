package com.android.afaqtechnologies.logindemokotlin.Db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


@Dao
interface Emp_DAO {


    @Insert
    fun save_Emp(emp: Emp_entity)


    @Query("select * from Emp_entity")
    fun readEmp(): List<Emp_entity>
}