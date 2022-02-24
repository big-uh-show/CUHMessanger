package com.cuh.domain.usecase.user

import com.cuh.domain.model.user.UserData
import com.cuh.domain.repository.user.UserDataRepository

class LoginUseCase (private val userDataRepository: UserDataRepository){

    suspend fun invoke(id : String, pw: String): UserData {
        return userDataRepository.login(id, pw)
        // 1 day 1 commit에 매몰되지 않기
    }
}