package com.example.navigationapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Button

class PingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ping)



        val returnButton = findViewById<Button>(R.id.returnButton)
        returnButton.setOnClickListener { e ->
            finish()
        }
        // PASO 1 para que aparezca el menú contextual en returnButton
        registerForContextMenu(returnButton)

    }

    // PASO 2 para decir qué menú aparece en returnButton
    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        when (v?.id) {
            R.id.returnButton ->
                menuInflater.inflate(R.menu.colors_menu, menu)
        }
    }

    // PASO 3 para programar qué hace cada opción
    override fun onContextItemSelected(item: MenuItem): Boolean {
        val closeShowNumberActivityButton = findViewById<Button>(R.id.returnButton)

        return when (item.itemId) {
            R.id.greenItem -> {
                closeShowNumberActivityButton.setBackgroundColor(Color.GREEN)
                true
            }
            R.id.greyItem -> {
                closeShowNumberActivityButton.setBackgroundColor(Color.GRAY)
                true
            }
            else -> {
                super.onContextItemSelected(item)
            }
        }
    }
}