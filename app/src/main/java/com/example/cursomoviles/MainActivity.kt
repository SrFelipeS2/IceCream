package com.example.cursomoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private var edtUsername : EditText? = null
    private var edtPassword : EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.my_toolbar))

        edtUsername = findViewById(R.id.edtUsername)
        edtPassword = findViewById(R.id.edtPassword)
    }

    fun onLogin(botonLogin: View) {
        if (edtUsername!!.text.toString()=="Harveyjnz@hotmail.com") {
            if (edtPassword!!.text.toString()=="1234"){
                val Intento = Intent(this,WelcomeActivity:: class.java)
                 startActivity(Intento)

            }
         }
        }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main_activity,menu)
        return super.onCreateOptionsMenu(menu)

    }

    override fun onOptionsItemSelected(item: MenuItem) = when(item.itemId){
        R.id.action_settings -> {
            true
        }

        R.id.action_search -> {
            true
        }

        else -> {
            super.onOptionsItemSelected(item)
        }
    }



}
