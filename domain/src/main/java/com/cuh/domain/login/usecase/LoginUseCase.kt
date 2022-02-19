package com.cuh.domain.login.usecase

import com.cuh.domain.login.model.UserData
import com.cuh.domain.login.repository.UserDataRepository

class LoginUseCase (private val userDataRepository: UserDataRepository){

    suspend fun invoke(id : String, pw: String): UserData {
        return userDataRepository.login(id, pw)
        // 1 day 1 commit에 매몰되지 않기
    }
}