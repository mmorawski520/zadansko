package com.example.zadansko

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.core.util.toRange
import java.util.*


class MainActivity : AppCompatActivity() {
    private var counter:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.  onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)

        val btnAddToList = findViewById<Button>(R.id.btnAddToList)
        val btnIncrease = findViewById<Button>(R.id.btnIncrease)
        val btnRandom = findViewById<Button>(R.id.btnRandom)

        val textviewRandom = findViewById<TextView>(R.id.textViewRandom)
        val textViewIncrease = findViewById<TextView>(R.id.textviewIncrease);
        val random = Random()

        btnIncrease.setOnClickListener {
            counter++;
            textViewIncrease.text = "increase : "+counter.toString()
        }

        btnRandom.setOnClickListener {
            textviewRandom.text = "random "+  random.nextInt()
        }

        btnAddToList.setOnClickListener {
            //listView.
        }
    }
}