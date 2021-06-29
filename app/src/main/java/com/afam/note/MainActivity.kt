package com.afam.note

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val floatingNewNoteBtn = findViewById<FloatingActionButton>(R.id.floatingNewNoteBtn)
        floatingNewNoteBtn.setOnClickListener { this.newNote() }
    }
    private fun newNote(){
        println("Nueva Nota")
        val intent = Intent(this, NewNoteActivity::class.java)
        startActivity(intent)
    }
}