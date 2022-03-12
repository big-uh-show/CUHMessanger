package com.cuh.domain.login.repository.user

import com.cuh.domain.login.model.user.UserData

interface UserDataRepository {
    fun login(userID:String, userPW:String): UserData
    fun logout():Boolean
    fun registration(data: UserData):Boolean
}