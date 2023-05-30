package com.azimzada.switchandtogglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.SeekBar
import com.azimzada.switchandtogglebutton.databinding.ActivityAndroidWifgetsBinding
import java.util.zip.Inflater

class AndroidWifgetsActivity : AppCompatActivity() {
    lateinit var binding: ActivityAndroidWifgetsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAndroidWifgetsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonBasla.setOnClickListener()
        {
            binding.progressBar.visibility = View.VISIBLE
        }
        binding.buttonDur.setOnClickListener()
        {
            binding.progressBar.visibility = View.INVISIBLE
        }



        binding.slider.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                binding.TVSonuc.text = "Sonuc : ${p1}"
                Log.e("Errror" , p1.toString())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

                Log.e("Errror" , "w")

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

                Log.e("Errror" , "aa")

            }
        })
        binding.BtnGonder.setOnClickListener()
        {
            val gelenIlerleme  = binding.slider.progress //  sonuncu deyer
            val gelenOylama = binding.ratingBar.rating
            Log.e("Gonder" , "Ilerleme :  ${gelenIlerleme} , oylama : ${gelenOylama}" )
        }
    }
}