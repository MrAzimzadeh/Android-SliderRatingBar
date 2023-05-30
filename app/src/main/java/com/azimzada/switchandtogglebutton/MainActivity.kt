package com.azimzada.switchandtogglebutton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.azimzada.switchandtogglebutton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.switch1.setOnCheckedChangeListener { compoundButton, b ->

            if (b) {

                Log.e("Toogle", "ON")
            } else {
                Log.e("Toogle", "OFF")
            }
        }
        binding.toggleButton.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                Log.e("Switch", "ON")
            } else {
                Log.e("Switch", "OFF")
            }
        }

        binding.button.setOnClickListener()
        {
            var switch = binding.switch1.isChecked
            var toogle = binding.toggleButton.isChecked
            Log.e("Switch ", switch.toString())
            Log.e("Toggle ", toogle.toString())
        }

        binding.button2.setOnClickListener()
        {
            var yeniIntent = Intent(this@MainActivity, RadioButtomandCheckBoxActivity::class.java)
            startActivity(yeniIntent);
        }
        binding.button4.setOnClickListener()
        {
            var yeniIntent = Intent(this@MainActivity, AndroidWifgetsActivity::class.java)
            startActivity(yeniIntent);
        }

    }


}