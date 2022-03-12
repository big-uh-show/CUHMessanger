package com.cuh.data.login.model.userdata

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "User")
data class UserEntity (
    @PrimaryKey
    @ColumnInfo(name = "id")
    val userID:String,
    @ColumnInfo(name = "name")
    val name:String,
    @ColumnInfo(name = "email")
    val email:String
    )