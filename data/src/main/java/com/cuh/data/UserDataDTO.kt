package com.cuh.data

import com.cuh.domain.UserData

data class UserDataDTO  (
    private val userId:String,
    private val userPw:String,
    private val info:String):UserData