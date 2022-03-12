package com.cuh.data.login.model.userdata

import com.google.gson.annotations.SerializedName

data class UserResponse (
    @SerializedName("id")
    val userID:String,
    @SerializedName("pw")
    val name:String,
    @SerializedName("email")
    val email:String
)