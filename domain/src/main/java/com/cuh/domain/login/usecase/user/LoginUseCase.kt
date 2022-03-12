package com.cuh.domain.login.usecase.user

import com.cuh.domain.login.model.user.UserData
import com.cuh.domain.login.repository.user.UserDataRepository

class LoginUseCase (private val userDataRepository: UserDataRepository){

    suspend fun invoke(id : String, pw: String): UserData {
        return userDataRepository.login(id, pw)
    }
}