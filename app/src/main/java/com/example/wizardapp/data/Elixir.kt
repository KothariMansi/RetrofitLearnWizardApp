package com.example.wizardapp.data


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Elixir(
    @Json(name = "id")
    val id: String,
    @Json(name = "name")
    val name: String
)