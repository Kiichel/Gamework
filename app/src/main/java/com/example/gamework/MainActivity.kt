package com.example.gamework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dressapp.SignInActivity
import com.example.gamework.teacher.TeacherMainActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val i = Intent(this, SignInActivity::class.java)
        startActivity(i)
    }
}