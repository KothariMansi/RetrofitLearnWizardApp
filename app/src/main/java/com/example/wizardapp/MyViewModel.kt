package com.example.wizardapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MyViewModel: ViewModel() {
    private val _harryPotterData = MutableLiveData("No Data")
    val harryPotterData: LiveData<String> get() = _harryPotterData

    init {
        viewModelScope.launch {
           // getHouses()
            getWizard("Fleamont", "Potter")
        }
    }

    private suspend fun getHouses() {
        _harryPotterData.value = RetrofitClient.wizardWorldApiService.getHouses().toString()
    }

    private suspend fun getWizard(firstName: String? = null, lastName: String? = null) {
        _harryPotterData.value = RetrofitClient.wizardWorldApiService.getWizards(firstName, lastName).toString()
    }
}