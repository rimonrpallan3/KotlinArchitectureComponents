package com.example.kotlinapplication.activity.splashScreen.ui.Splash

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinapplication.activity.splashScreen.data.UserRepository

class SplashViewModelFactory (private val userRepository: UserRepository)
    : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return SplashViewModel(userRepository) as T
    }
}