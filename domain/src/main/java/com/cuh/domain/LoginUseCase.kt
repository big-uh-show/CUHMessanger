package com.cuh.domain

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LoginUseCase (private val userDataRepository: UserDataRepository){

    suspend fun invoke(id : String, pw: String) {

        CoroutineScope(Dispatchers.IO).launch {
            userDataRepository.login(id, pw)
        }
    }
}