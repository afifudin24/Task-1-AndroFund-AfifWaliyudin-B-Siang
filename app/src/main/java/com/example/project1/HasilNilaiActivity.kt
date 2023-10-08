package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.TextView

class HasilNilaiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil_nilai)

        val bundle = intent.extras
        if (bundle != null){
            val nama = bundle.getString("nama")
            val kelas = bundle.getString("kelas")
            val nilaiA = bundle.getInt("nilaiA")
            val nilaiB = bundle.getInt("nilaiB")
            val nilaiC = bundle.getInt("nilaiC")
            val namaText = findViewById<TextView>(R.id.namaText)
            val kelasText = findViewById<TextView>(R.id.kelasText)
            val aText = findViewById<TextView>(R.id.aText)
            val bText = findViewById<TextView>(R.id.bText)
            val cText = findViewById<TextView>(R.id.cText)
            val ketText =  findViewById<TextView>(R.id.keterangan)
            val totalText = findViewById<TextView>(R.id.totalText)
            val total = nilaiA + nilaiB + nilaiC
            val ratarata = total / 3
            if(ratarata > 75){
                ketText.text = "LULUS"
            }else{
                ketText.text = "BELUM LULUS"
            }
            namaText.text = nama
            kelasText.text = kelas
            aText.text = nilaiA.toString()
            bText.text = nilaiB.toString()
            cText.text = nilaiC.toString()
            totalText.text = total.toString()

        }else{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}