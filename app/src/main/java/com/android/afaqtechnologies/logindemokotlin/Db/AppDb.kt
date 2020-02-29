package com.android.afaqtechnologies.logindemokotlin.Db

import androidx.room.Dao
import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [(Emp_entity::class)],version = 1)
abstract class AppDb : RoomDatabase(){


    abstract fun empDao() : Emp_DAO
}