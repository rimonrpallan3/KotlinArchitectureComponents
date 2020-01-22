package com.example.kotlinapplication.activity.splashScreen.data

class UserDataBase private constructor(){

    var userDao = UserDao()
        private set

    companion object {

        @Volatile private var instance: UserDataBase? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?:UserDataBase().also { instance = it }
            }
    }
}