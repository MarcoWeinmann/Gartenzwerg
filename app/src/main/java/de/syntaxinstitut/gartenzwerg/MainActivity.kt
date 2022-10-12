package de.syntaxinstitut.gartenzwerg

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import de.syntaxinstitut.gartenzwerg.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //BottomBar
    lateinit var toolbar: ActionBar

    private lateinit var navController: NavController

    private lateinit var binding: ActivityMainBinding

    /* -------------------- Lifecycle -------------------- */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Das Binding zur XML-Datei
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       // Variable für die BottomNavigationBar
        val bottomNavigation: BottomNavigationView = binding.bottomNavigationView

        //Verbindet NavigationBar mit NavController
        navController = Navigation.findNavController(this, R.id.main_host)
        bottomNavigation.setupWithNavController(navController)

    }
    //soll Bar ausblenden
    fun hideBottombar() {
        binding.bottomNavigationView.visibility = View.GONE
    }
    //soll Bar zeigen
    fun showBottombar() {
        binding.bottomNavigationView.visibility = View.VISIBLE
    }
}


