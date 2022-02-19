package com.cuh.domain.login.repository

import com.cuh.domain.login.model.UserData

interface UserDataRepository {
    fun login(userID:String, userPW:String): UserData
}