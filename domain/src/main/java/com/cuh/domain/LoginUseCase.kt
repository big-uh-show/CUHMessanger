package com.cuh.domain

class LoginUseCase (private val userDataRepository: UserDataRepository){

    suspend fun invoke(id : String, pw: String):UserData {
        return userDataRepository.login(id, pw)
    }
}