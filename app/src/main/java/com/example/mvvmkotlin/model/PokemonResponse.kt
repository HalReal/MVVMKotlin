package com.example.mvvmkotlin.model

data class PokemonResponse (
    val pokemon: MutableList<PokemonDataModel> = mutableListOf()
)


data class PokemonDataModel (
    val id: Long,
    val name: String = "",
    val img: String
    )
