package com.example.wizardapp

import com.example.wizardapp.data.House
import retrofit2.http.GET

interface WizardWorldApiService {

    @GET("/Houses")
    suspend fun getHouses(): List<House>
}