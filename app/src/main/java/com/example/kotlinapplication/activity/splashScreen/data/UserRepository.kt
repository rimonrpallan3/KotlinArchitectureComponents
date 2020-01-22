package com.example.kotlinapplication.activity.splashScreen.data

class UserRepository private constructor(private val userDao: UserDao) {


    fun addUserDetail(userDetail :UserDetail){
        userDao.addUserDetail(userDetail)
    }

    fun getUserDetail() = userDao.getUserDetail()

    companion object {
        @Volatile private var instance : UserRepository? = null

        fun getInstance(userDao: UserDao){
            instance ?: synchronized(this) {
                instance?:UserRepository(userDao).also { instance = it }
            }

        }
    }
}