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

/**
 * Main Activity, dient als Einstiegspunkt für die App
 */
class MainActivity : AppCompatActivity() {

    //BottomBar
    lateinit var toolbar: ActionBar

    private lateinit var navController: NavController

    /* -------------------- Klassen Variablen -------------------- */

    /** Bindet das XML-View mit der Klasse um auf die Elemente zugreifen zu können */
    private lateinit var binding: ActivityMainBinding

    /* -------------------- Lifecycle -------------------- */

    /**
     * Lifecycle Methode, wird aufgerufen wenn Activity erstellt wird
     *
     * @param savedInstanceState      Save state vom view
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Das Binding zur XML-Datei
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       // toolbar = supportActionBar!!
        val bottomNavigation: BottomNavigationView = binding.bottomNavigationView

        navController = Navigation.findNavController(this, R.id.main_host)
        bottomNavigation.setupWithNavController(navController)

        //val navMenu = findViewById(R.menu.nav_menu)
    }
    fun hideBottombar() {
        binding.bottomNavigationView.visibility = View.GONE
    }
    fun showBottombar() {
        binding.bottomNavigationView.visibility = View.VISIBLE
    }
}


