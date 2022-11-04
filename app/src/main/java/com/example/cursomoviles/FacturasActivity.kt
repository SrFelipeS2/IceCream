package com.example.cursomoviles

import ToDoFragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView

class FacturasActivity : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facturas)

        setSupportActionBar(findViewById(R.id.my_toolbar))

        val drawerLayout:DrawerLayout = findViewById(R.id.drawer_layout)
        val navView:NavigationView = findViewById(R.id.nav_view)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_container_view) as NavHostFragment
        val navController = navHostFragment.navController

        appBarConfiguration = AppBarConfiguration(setOf(R.id.ToDoFragment,R.id.AboutFragment),drawerLayout)

        setupActionBarWithNavController(navController,appBarConfiguration)

        navView.setupWithNavController(navController)



/*        if(savedInstanceState == null){

            supportFragmentManager.beginTransaction()
                .setReorderingAllowed(true)
                .add(R.id.fragment_container_view,ToDoFragment::class.java, null,"todo")
                .commit()


        }*/
    }
}