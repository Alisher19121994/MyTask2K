package com.best.mytask2k

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.best.mytask2k.Users.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.btn1)
        button.setOnClickListener {
            val user = User("Alisher", 27)
            open(user)
        }
    }

    fun open(user: User) {
        val intent = Intent(this, SecondActivity2::class.java)
        intent.putExtra("name", user)
        startActivity(intent)
    }
}