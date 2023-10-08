package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class DataSiswaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_siswa)
        val nama = findViewById<EditText>(R.id.isianNamaKelakuan)
        val kelas = findViewById<EditText>(R.id.isianKelasKelakuan)
        val nilaiA = findViewById<EditText>(R.id.isianNilaiA)
        val nilaiB = findViewById<EditText>(R.id.isianNilaiB)
        val nilaiC = findViewById<EditText>(R.id.isianNilaiC)
        val tampilkanHasil = findViewById<Button>(R.id.tampilkanHasilKelakuan)
        val intentHasil = Intent(this, HasilNilaiActivity::class.java)
        tampilkanHasil.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("nama", nama.text.toString())
            bundle.putString("kelas", kelas.text.toString())
            bundle.putInt("nilaiA", nilaiA.text.toString().toInt())
            bundle.putInt("nilaiB", nilaiB.text.toString().toInt())
            bundle.putInt("nilaiC", nilaiC.text.toString().toInt())
            intentHasil.putExtras(bundle)
            startActivity(intentHasil)

        }
    }
}