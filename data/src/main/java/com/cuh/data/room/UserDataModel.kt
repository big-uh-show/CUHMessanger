package com.cuh.data.room

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.cuh.domain.UserData
import com.google.gson.annotations.SerializedName


@Entity
data class UserDataModel(
    @PrimaryKey
    @SerializedName("ID")
    private val userId:String,
    @SerializedName("PW")
    private val userPw:String,
    @SerializedName("UserInfo")
    private val info:String): UserData