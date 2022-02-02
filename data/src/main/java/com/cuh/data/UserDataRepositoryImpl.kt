package com.cuh.data

import com.cuh.domain.UserData
import com.cuh.domain.UserDataRepository


class UserDataRepositoryImpl : UserDataRepository{
     override fun login(userId: String, userPW: String): UserDataDTO {

         val data = UserDataDTO("x","y","z") //from Remote service
         return data
    }

}