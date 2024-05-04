package com.example.wizardapp.data


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Wizard(
    @Json(name = "elixirs")
    val elixirs: List<Elixir>?,
    @Json(name = "firstName")
    val firstName: String?,
    @Json(name = "id")
    val id: String,
    @Json(name = "lastName")
    val lastName: String?
)