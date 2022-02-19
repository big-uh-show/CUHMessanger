package com.cuh.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.cuh.domain.login.model.UserData

@Dao
interface UserDataDAO {

    @Query("쿼리 작성")
    fun getUserData(loginId: String) : UserData
}