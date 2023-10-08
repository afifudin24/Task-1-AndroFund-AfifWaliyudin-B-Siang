package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HasilKelakuanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil_kelakuan)

        val bundle = intent.extras
        if (bundle != null){
            val nama = bundle.getString("nama")
            val kelas = bundle.getString("kelas")
            val disiplin = bundle.getInt("disiplin")
            val peduli = bundle.getInt("peduli")
            val sopan = bundle.getInt("sopan")
            val namaText = findViewById<TextView>(R.id.namaText)
            val kelasText = findViewById<TextView>(R.id.kelasText)
            val ket = findViewById<TextView>(R.id.keterangan)
            val aText = findViewById<TextView>(R.id.aText)
            val bText = findViewById<TextView>(R.id.bText)
            val cText = findViewById<TextView>(R.id.cText)
            var total = disiplin + sopan + peduli
            var keterangan = ""
            if(total == 3){
                keterangan = "Sangat Baik"
            }else if(total == 2){
                keterangan = "Baik"
            }else{
                keterangan = "Tidak Baik"
            }
            namaText.text = nama
            kelasText.text = kelas
            aText.text = if (disiplin == 0) "Tidak" else "Ya"
            bText.text = if (peduli == 0 ) "Tidak" else "Ya"
            cText.text = if (sopan == 0) "Tidak" else "Ya"
            ket.text = keterangan

        }else{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}