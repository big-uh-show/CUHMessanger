package com.cuh.data.login.db

import androidx.room.Dao
import androidx.room.Query
import com.cuh.domain.login.model.user.UserData

@Dao
interface UserDataDAO {

    //@Query("쿼리 작성")
    fun getUserData(loginId: String) : UserData
}