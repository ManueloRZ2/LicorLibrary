package com.LicorLibrary.licorlibrary.ui.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.LicorLibrary.licorlibrary.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var splashBinding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        splashBinding = ActivitySplashBinding.inflate(layoutInflater)

        setContentView(splashBinding.root)
    }
}