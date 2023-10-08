package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tombolnilai = findViewById<Button>(R.id.kenilai)
        val tombolkelakuan = findViewById<Button>(R.id.kekelakuan)
        val intentnilai = Intent(this, DataSiswaActivity::class.java)
        val intentkelakuan = Intent(this, KelakuanSiswaActivity::class.java)

        tombolnilai.setOnClickListener {
            startActivity(intentnilai)
        }
        tombolkelakuan.setOnClickListener {
            startActivity(intentkelakuan)
        }

    }






}