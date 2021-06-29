package com.afam.note

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText

class NewNoteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTitle(R.string.newNote)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_note)

        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.btnSave -> {
                val etTitle:EditText = findViewById<EditText>(R.id.etTitle)
                val etMessage:EditText = findViewById<EditText>(R.id.etMessage)
                println(etTitle.text.toString()+' '+ etMessage.text.toString())
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}