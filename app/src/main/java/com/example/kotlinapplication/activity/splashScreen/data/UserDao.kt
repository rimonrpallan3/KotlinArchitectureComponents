package com.example.kotlinapplication.activity.splashScreen.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class UserDao {

    private val userDetailList = mutableListOf<UserDetail>()

    private val userDetail = MutableLiveData<List<UserDetail>>()

    init {
        userDetail.value = userDetailList
    }

    fun addUserDetail(userDetails: UserDetail) {
        userDetailList.add(userDetails)
        userDetail.value = userDetailList
    }

    // Casting MutableLiveData to LiveData because its value
    // shouldn't be changed from other classes
    fun getUserDetail() = userDetail as LiveData<List<UserDetail>>

}