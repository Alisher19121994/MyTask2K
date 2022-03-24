package com.best.mytask2k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity2 : AppCompatActivity() {
    var TAG = SecondActivity2::class.java.toString()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)
        openPage()
    }

    fun openPage() {
        val txtBtn = findViewById<TextView>(R.id.txt2)
        val intent = intent.getSerializableExtra("name")
        Log.d(TAG, intent.toString())
        txtBtn.text = intent.toString()
    }
}