package com.cuh.data.login.repository

import com.cuh.domain.login.model.user.UserData
import com.cuh.domain.login.repository.user.UserDataRepository

class UserDataRepositoryImpl : UserDataRepository {
    override fun login(userID: String, userPW: String): UserData {
        TODO()
    }

    override fun logout(): Boolean {
        TODO("Not yet implemented")
    }

    override fun registration(data: UserData): Boolean {
        TODO("Not yet implemented")
    }
}