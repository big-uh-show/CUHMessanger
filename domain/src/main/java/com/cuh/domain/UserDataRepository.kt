package com.cuh.domain

interface UserDataRepository {
    fun login(userID:String, userPW:String): UserData
}