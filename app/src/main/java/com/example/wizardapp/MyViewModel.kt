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
            getHouses()
        }
    }

    private suspend fun getHouses() {
        _harryPotterData.value = RetrofitClient.wizardWorldApiService.getHouses().toString()
    }
}