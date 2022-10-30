package com.example.cursomoviles

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import android.widget.Toast.makeText as makeText1

class ConesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cones)
    }

    fun onChocolate(botonChocolate: View) {

        val positiveButton={dialog:DialogInterface,which:Int->

            val Intento_facturas = Intent(this,FacturasActivity:: class.java)
            startActivity(Intento_facturas)
        }
        val negativeButton={_:DialogInterface,_:Int->}
        val dialog = AlertDialog.Builder(this)
            .setTitle("You are about to generate your invoice!")
            .setMessage("Do you wish to continue?")
            .setPositiveButton("OK",positiveButton)
            .setNegativeButton("CANCEL",negativeButton)
            .create() .show()
    }

    fun onCherry(botonCherry: View) {

        val positiveButton={dialog:DialogInterface,which:Int->}
        val negativeButton={_:DialogInterface,_:Int->}
        val dialog = AlertDialog.Builder(this)
            .setTitle("You are about to generate your invoice!")
            .setMessage("Do you wish to continue?")
            .setPositiveButton("OK",positiveButton)
            .setNegativeButton("CANCEL",negativeButton)
            .create() .show()
    }

    fun onStrawberry(botonStrawberry: View) {

        val positiveButton={dialog:DialogInterface,which:Int->}
        val negativeButton={_:DialogInterface,_:Int->}
        val dialog = AlertDialog.Builder(this)
            .setTitle("You are about to generate your invoice!")
            .setMessage("Do you wish to continue?")
            .setPositiveButton("OK",positiveButton)
            .setNegativeButton("CANCEL",negativeButton)
            .create() .show()
    }

    fun onOrange(botonOrange: View) {

        val positiveButton={dialog:DialogInterface,which:Int->}
        val negativeButton={_:DialogInterface,_:Int->}
        val dialog = AlertDialog.Builder(this)
            .setTitle("You are about to generate your invoice!")
            .setMessage("Do you wish to continue?")
            .setPositiveButton("OK",positiveButton)
            .setNegativeButton("CANCEL",negativeButton)
            .create() .show()
    }

    fun onApple(botonApple: View) {

        val positiveButton={dialog:DialogInterface,which:Int->}
        val negativeButton={_:DialogInterface,_:Int->}
        val dialog = AlertDialog.Builder(this)
            .setTitle("You are about to generate your invoice!")
            .setMessage("Do you wish to continue?")
            .setPositiveButton("OK",positiveButton)
            .setNegativeButton("CANCEL",negativeButton)
            .create() .show()
    }

    fun onGrape(botonGrape: View) {

        val positiveButton={dialog:DialogInterface,which:Int->}
        val negativeButton={_:DialogInterface,_:Int->}
        val dialog = AlertDialog.Builder(this)
            .setTitle("You are about to generate your invoice!")
            .setMessage("Do you wish to continue?")
            .setPositiveButton("OK",positiveButton)
            .setNegativeButton("CANCEL",negativeButton)
            .create() .show()
    }

}