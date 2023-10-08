package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

@Suppress("UNUSED_ANONYMOUS_PARAMETER")
class KelakuanSiswaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelakuan_siswa)
        val nama = findViewById<EditText>(R.id.isianNamaKelakuan)
        val kelas = findViewById<EditText>(R.id.isianKelasKelakuan)
        var disiplin = findViewById<RadioGroup>(R.id.disiplin)
        var disiplinYa = findViewById<RadioButton>(R.id.disiplin1)
        var disiplinTidak = findViewById<RadioButton>(R.id.disiplin2)
        var selectedDisiplin:Int = 0
        var selectedPeduli:Int = 0
        var selectedSopan:Int = 0
        val peduli = findViewById<RadioGroup>(R.id.peduli)
        val peduliYa = findViewById<RadioButton>(R.id.peduliYa)
        val peduliTidak = findViewById<RadioButton>(R.id.peduliTidak)
        val sopansantun = findViewById<RadioGroup>(R.id.sopan)
        val sopansantunYa = findViewById<RadioButton>(R.id.sopanYa)
        val sopansantunTidak = findViewById<RadioButton>(R.id.sopanTidak)
        val tampilkanHasilKelakuan = findViewById<Button>(R.id.tampilkanHasilKelakuan)
        val intentHasil = Intent(this, HasilKelakuanActivity::class.java)
        disiplin.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.disiplin1 -> {
                    selectedDisiplin = 1

                }
                R.id.disiplin2 -> {
                    selectedDisiplin = 0

                }
            }
        }

        peduli.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.peduliYa -> {
                    selectedPeduli = 1
                }
                R.id.peduliTidak -> {
                   selectedPeduli = 0
                }
            }
        }
        sopansantun.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.sopanYa -> {
                    selectedSopan = 1
                }
                R.id.sopanTidak -> {
                   selectedSopan = 0
                }
            }
        }





        tampilkanHasilKelakuan.setOnClickListener {

            val bundle = Bundle()
            bundle.putString("nama", nama.text.toString())
            bundle.putString("kelas", kelas.text.toString())
            bundle.putInt("disiplin", selectedDisiplin)
            bundle.putInt("peduli", selectedPeduli)
            bundle.putInt("sopan", selectedSopan)

            intentHasil.putExtras(bundle)
            startActivity(intentHasil)

        }


    }

}