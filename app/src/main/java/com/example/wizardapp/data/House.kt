package com.example.wizardapp.data


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class House(
    @Json(name = "animal")
    val animal: String,
    @Json(name = "commonRoom")
    val commonRoom: String,
    @Json(name = "element")
    val element: String,
    @Json(name = "founder")
    val founder: String,
    @Json(name = "ghost")
    val ghost: String,
    @Json(name = "heads")
    val heads: List<HouseHead>,
    @Json(name = "houseColours")
    val houseColours: String,
    @Json(name = "id")
    val id: String,
    @Json(name = "name")
    val name: String,
    @Json(name = "traits")
    val traits: List<Trait>
)