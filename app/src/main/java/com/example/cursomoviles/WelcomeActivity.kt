package com.example.cursomoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
    }

    fun onCones(botonCones: View) {
                val Intento_cones = Intent(this,ConesActivity:: class.java)
                startActivity(Intento_cones)
            }

    fun onCups(botonCups: View) {
        val Intento_cones = Intent(this,CupsActivity:: class.java)
        startActivity(Intento_cones)
    }

}