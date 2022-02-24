package com.cuh.domain.repository.user

import com.cuh.domain.model.user.UserData

interface UserDataRepository {
    fun login(userID:String, userPW:String): UserData
    fun logout():Boolean
    fun registration(data: UserData):Boolean
}