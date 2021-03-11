package com.cairnfort.notekeeper202102

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.content_note_list.*

class NoteListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            //  Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
            //   .setAction("Action", null).show()

            val activityIntent = Intent(this, MainActivity::class.java)
            startActivity(activityIntent)

        }

        listNotes.adapter =
            ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, DataManager.notes)

        listNotes.setOnItemClickListener { parent, view, position, id ->

            Log.i("NOTEMESSAGES", "item has been clicked: " + position.toString())

            val activityIntent = Intent(this, MainActivity::class.java)
            activityIntent.putExtra(EXTRA_NOTE_POSITION, position)
            startActivity(activityIntent)

        }


    }
}