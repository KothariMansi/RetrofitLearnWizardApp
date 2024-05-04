package com.example.wizardapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    private val _harryPotterData = MutableLiveData("No Data")
    val harryPotterData: LiveData<String> get() = _harryPotterData
}