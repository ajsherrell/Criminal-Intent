package com.ajsherrell.criminalintent

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class CrimeViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor().newInstance()
    }
}