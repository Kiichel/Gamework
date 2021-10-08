package com.example.gamework.student

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.gamework.MainActivity
import com.example.gamework.R

class StudentMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_main)
    }

    fun zadan(view: View) {
        val i = Intent(this, HomeworkActivity::class.java)
        startActivity(i)
    }

    fun collection(view: View) {
        val i = Intent(this, CollectionStudentActivity::class.java)
        startActivity(i)
    }

    fun surpriseStudentId(view: View) {
        val i = Intent(this, SurpriseStActivity::class.java)
        startActivity(i)
    }
}