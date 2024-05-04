package com.example.wizardapp

import com.example.wizardapp.data.House
import com.example.wizardapp.data.Wizard
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface WizardWorldApiService {

    @GET("/Houses")
    suspend fun getHouses(): List<House>

    @Headers("accept: text/plain")
    @GET("/Wizards")
    suspend fun getWizards(
        @Query("FirstName") firstName: String? = null,
        @Query("LastName") lastName: String? = null
    ) : List<Wizard>
}