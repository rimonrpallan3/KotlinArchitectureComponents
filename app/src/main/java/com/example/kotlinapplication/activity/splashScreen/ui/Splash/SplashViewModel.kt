package com.example.kotlinapplication.activity.splashScreen.ui.Splash

import androidx.lifecycle.ViewModel
import com.example.kotlinapplication.activity.splashScreen.data.UserDetail
import com.example.kotlinapplication.activity.splashScreen.data.UserRepository

class SplashViewModel(private val userRepository: UserRepository) : ViewModel() {

    fun getUserDetail() = userRepository.getUserDetail()

    fun addUserDetail(userDetail: UserDetail) = userRepository.addUserDetail(userDetail)
}