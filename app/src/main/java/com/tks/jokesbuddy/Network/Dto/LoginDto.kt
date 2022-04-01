package com.tks.jokesbuddy.Dto
import com.google.gson.annotations.SerializedName
data class LoginDto(@SerializedName("email") val email:String,
                    @SerializedName ("password")   val password:String)
