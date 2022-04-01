package com.tks.jokesbuddy.Network.Repository

import com.tks.jokesbuddy.Dto.LoginDto
import com.tks.jokesbuddy.Network.Dto.TokenDto
import retrofit2.Response
import retrofit2.http.POST
import retrofit2.http.Body
interface AuthService {

@POST("auth")
suspend fun getLogin(@Body loginDto: LoginDto):Response<TokenDto>

}