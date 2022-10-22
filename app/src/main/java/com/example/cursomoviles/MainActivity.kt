package com.example.cursomoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.Toast

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
        if (edtUsername!!.text.toString()=="admin" && edtPassword!!.text.toString()=="1234" ) {

                val Intento = Intent(this,WelcomeActivity:: class.java)
                 startActivity(Intento)
            }
            else{
                Toast.makeText(this, "Invalid username or password",
                    Toast.LENGTH_LONG).show()
            }


        }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main_activity,menu)
        return super.onCreateOptionsMenu(menu)

    }

    override fun onOptionsItemSelected(item: MenuItem) = when(item.itemId){
        R.id.action_settings -> {
            Toast.makeText(this, "configuration option temporarily disabled",
            Toast.LENGTH_LONG).show()
            true
        }

        R.id.action_search -> {
            Toast.makeText(this, "search option temporarily disabled",
                Toast.LENGTH_LONG).show()
            true
        }

        R.id.action_logout -> {
            Toast.makeText(this, "logout option temporarily disabled",
                Toast.LENGTH_LONG).show()
            true
        }

        else -> {
            super.onOptionsItemSelected(item)
        }
    }



}
