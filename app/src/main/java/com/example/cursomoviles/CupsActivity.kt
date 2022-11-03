package com.example.cursomoviles

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog

class CupsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cups)
    }

    fun onCopadelice(botonCopadelice: View) {

        val positiveButton={ dialog: DialogInterface, which:Int->
            val Intento_facturas = Intent(this,FacturasActivity:: class.java)
            startActivity(Intento_facturas)
        }
        val negativeButton={ _: DialogInterface, _:Int->}
        val dialog = AlertDialog.Builder(this)
            .setTitle("You are about to generate your invoice!")
            .setMessage("Do you wish to continue?")
            .setPositiveButton("OK",positiveButton)
            .setNegativeButton("CANCEL",negativeButton)
            .create() .show()
    }

    fun onCopaexotic(botonCopaexotic: View) {

        val positiveButton={ dialog: DialogInterface, which:Int->
            val Intento_facturas = Intent(this,FacturasActivity:: class.java)
            startActivity(Intento_facturas)
        }
        val negativeButton={ _: DialogInterface, _:Int->}
        val dialog = AlertDialog.Builder(this)
            .setTitle("You are about to generate your invoice!")
            .setMessage("Do you wish to continue?")
            .setPositiveButton("OK",positiveButton)
            .setNegativeButton("CANCEL",negativeButton)
            .create() .show()
    }

    fun onCoparedfruit(botonCoparedfruit: View) {

        val positiveButton={ dialog: DialogInterface, which:Int->
            val Intento_facturas = Intent(this,FacturasActivity:: class.java)
            startActivity(Intento_facturas)
        }
        val negativeButton={ _: DialogInterface, _:Int->}
        val dialog = AlertDialog.Builder(this)
            .setTitle("You are about to generate your invoice!")
            .setMessage("Do you wish to continue?")
            .setPositiveButton("OK",positiveButton)
            .setNegativeButton("CANCEL",negativeButton)
            .create() .show()
    }

    fun onCopatemptation(botonCopatemptation: View) {

        val positiveButton={ dialog: DialogInterface, which:Int->
            val Intento_facturas = Intent(this,FacturasActivity:: class.java)
            startActivity(Intento_facturas)
        }
        val negativeButton={ _: DialogInterface, _:Int->}
        val dialog = AlertDialog.Builder(this)
            .setTitle("You are about to generate your invoice!")
            .setMessage("Do you wish to continue?")
            .setPositiveButton("OK",positiveButton)
            .setNegativeButton("CANCEL",negativeButton)
            .create() .show()
    }

    fun onCopachildish(botonCopashildish: View) {

        val positiveButton={ dialog: DialogInterface, which:Int->
            val Intento_facturas = Intent(this,FacturasActivity:: class.java)
            startActivity(Intento_facturas)
        }
        val negativeButton={ _: DialogInterface, _:Int->}
        val dialog = AlertDialog.Builder(this)
            .setTitle("You are about to generate your invoice!")
            .setMessage("Do you wish to continue?")
            .setPositiveButton("OK",positiveButton)
            .setNegativeButton("CANCEL",negativeButton)
            .create() .show()
    }

    fun onCopadecorate(botonCopadecorate: View) {

        val positiveButton={ dialog: DialogInterface, which:Int->
            val Intento_facturas = Intent(this,FacturasActivity:: class.java)
            startActivity(Intento_facturas)
        }
        val negativeButton={ _: DialogInterface, _:Int->}
        val dialog = AlertDialog.Builder(this)
            .setTitle("You are about to generate your invoice!")
            .setMessage("Do you wish to continue?")
            .setPositiveButton("OK",positiveButton)
            .setNegativeButton("CANCEL",negativeButton)
            .create() .show()
    }

}