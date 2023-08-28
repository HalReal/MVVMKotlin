package com.example.mvvmkotlin.services
import com.example.mvvmkotlin.model.PokemonResponse
import retrofit2.Response
import retrofit2.http.GET

interface WebService {
    @GET("")

suspend fun getPokemon(): Response<PokemonResponse>
}