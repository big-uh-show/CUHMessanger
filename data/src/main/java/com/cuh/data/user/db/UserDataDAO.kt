package com.cuh.data.user.db

import androidx.room.Dao
import androidx.room.Query
import com.cuh.domain.model.user.UserData

@Dao
interface UserDataDAO {

    @Query("쿼리 작성")
    fun getUserData(loginId: String) : UserData
}