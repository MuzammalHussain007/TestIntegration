package com.example.testintegration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.facebook.login.widget.DeviceLoginButton

class MainActivity : AppCompatActivity() {
    private lateinit var loginButton: DeviceLoginButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}