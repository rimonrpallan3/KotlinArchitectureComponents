package com.example.kotlinapplication.activity.splashScreen.utilities

import com.example.kotlinapplication.activity.splashScreen.data.UserDataBase
import com.example.kotlinapplication.activity.splashScreen.data.UserRepository
import com.example.kotlinapplication.activity.splashScreen.ui.Splash.SplashViewModelFactory

object InjectorUtil {

    // This will be called from QuotesActivity
    fun provideUserViewModelFactory(): SplashViewModelFactory {
        // ViewModelFactory needs a repository, which in turn needs a DAO from a database
        // The whole dependency tree is constructed right here, in one place
        val userRepository = UserRepository.getInstance(UserDataBase.getInstance().userDao)
        return SplashViewModelFactory(userRepository)
    }
}