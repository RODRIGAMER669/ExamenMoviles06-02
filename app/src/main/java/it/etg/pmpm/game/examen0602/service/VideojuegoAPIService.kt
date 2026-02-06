package it.etg.pmpm.game.examen0602.service

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url


interface VideojuegoAPIService {

    @GET
    suspend fun getVideojuego(@Url url:String): Response<VideojuegoResponse>
}