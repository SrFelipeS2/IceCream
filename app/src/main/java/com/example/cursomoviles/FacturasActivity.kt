package com.example.cursomoviles

import ToDoFragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FacturasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facturas)
        if(savedInstanceState == null){

            supportFragmentManager.beginTransaction()
                .setReorderingAllowed(true)
                .add(R.id.fragment_container_view,ToDoFragment::class.java, null,"todo")
                .commit()


        }
    }
}