package com.mehmetsalimbingol.todolist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.mehmetsalimbingol.todolist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate layout using ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Find NavHostFragment
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment

        // Get NavController from NavHostFragment
        val navController = navHostFragment.navController

        // Toolbar olmadığı için setupActionBarWithNavController'ı kaldırın
        // setSupportActionBar(binding.toolbar) // Bu satırı kaldırın
        // setupActionBarWithNavController(navController) // Bu satırı kaldırın
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = supportFragmentManager.findFragmentById(R.id.navHostFragment)?.findNavController()
        return navController?.navigateUp() ?: false
    }
}
