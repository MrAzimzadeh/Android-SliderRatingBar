package com.azimzada.switchandtogglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.azimzada.switchandtogglebutton.databinding.ActivityRadioButtomandCheckBoxBinding
import java.util.zip.Inflater

class RadioButtomandCheckBoxActivity : AppCompatActivity() {
    lateinit var binding: ActivityRadioButtomandCheckBoxBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRadioButtomandCheckBoxBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button3.setOnClickListener()
        {
            val javaDurum = binding.checkBoxJava.isChecked
            val kotlinDurum = binding.checkBoxKotlin.isChecked
            val barclondaDurun = binding.radioButtonBarcelona.isChecked
            val realMadrid = binding.radioButtonRealMadrid.isChecked


            Log.e("javaDurum", javaDurum.toString())
            Log.e("kotlinDurum", kotlinDurum.toString())
            Log.e("barclondaDurun", barclondaDurun.toString())
            Log.e("realMadrid", realMadrid.toString())

        }

        binding.radioButtonBarcelona.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                Toast.makeText(applicationContext , "Tebrikler : )" , Toast.LENGTH_SHORT).show()
            }

        }


    }
}