package com.example.myapplication

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recycler)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MainAdapter(fillList())
        }

    private fun fillList(): List<Friends> {
    val data = listOf(
        Friends(name="Bread Питт", avatar = R.drawable.firstplace, score = 1, steps = 10000),
        Friends(name="Cool Scyscrapper", avatar = R.drawable.secondplace, score = 2, steps = 10000),
        Friends(name="Epic Girl", avatar = R.drawable.thirdplace, score = 3, steps = 10000),
        Friends(name="Winter Forest", avatar = R.drawable.firstplace, score = 0, steps = 10000),
        Friends(name="Pink Girl", avatar = R.drawable.firstplace, score = 0, steps = 10000),
        Friends(name="Working Woman", avatar = R.drawable.firstplace, score = 0, steps = 10000),
        Friends(name="Guy in Shadow", avatar = R.drawable.firstplace, score = 0, steps = 10000),
        Friends(name="Beautiful Hidden", avatar = R.drawable.firstplace, score = 0, steps = 1544),
    )
    return data
    }
}