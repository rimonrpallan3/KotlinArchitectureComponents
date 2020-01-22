package com.example.kotlinapplication.activity.splashScreen.data

import java.sql.RowId

data class UserDetail(val username: String,
                      val password: String,
                      val id: RowId) {

    fun toSting(): String {
        return "$id - $username : $password"
    }
}