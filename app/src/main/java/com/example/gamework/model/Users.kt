package com.example.gamework.model

class Users() {

    lateinit var userName: String
    lateinit var userEmail: String

    constructor(name: String, _userEmail: String) : this() {
        userName = name
        userEmail = _userEmail
    }
}