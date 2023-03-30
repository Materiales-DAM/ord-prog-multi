package com.example.navigationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.PopupMenu

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showOptionsButton = findViewById<Button>(R.id.showOptionsButton)
        showOptionsButton.setOnClickListener { v ->
            val popupMenu = PopupMenu(this, v)
            popupMenu.inflate(R.menu.ping_pong_menu)
            popupMenu.show()
            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.pingItem -> {
                        val intent = Intent(this, PingActivity::class.java)
                        startActivity(intent)
                        true
                    }
                    R.id.pongItem -> {
                        val intent = Intent(this, PongActivity::class.java)
                        startActivity(intent)
                        true
                    }
                    else ->
                        super.onOptionsItemSelected(item)
                }
            }
        }


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.ping_pong_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.pingItem -> {
                val intent = Intent(this, PingActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.pongItem -> {
                val intent = Intent(this, PongActivity::class.java)
                startActivity(intent)
                true
            }
            else ->
                super.onOptionsItemSelected(item)
        }
    }
}