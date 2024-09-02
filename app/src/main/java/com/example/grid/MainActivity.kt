package com.example.grid

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.grid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        clickButton(binding.button1, "Button 1 clicked")
        clickButton(binding.button2, "Button 2 clicked")
        clickButton(binding.button3, "Button 3 clicked")
        clickButton(binding.button4, "Button 4 clicked")
        clickButton(binding.button5, "Button 5 clicked")
        clickButton(binding.button6, "Button 6 clicked")
        clickButton(binding.button7, "Button 7 clicked")
        clickButton(binding.button8, "Button 8 clicked")
        clickButton(binding.button9, "Button 9 clicked")
        clickButton(binding.button10, "Button 10 clicked")
    }

    private fun clickButton(button: Button, message: String) {
        button.setOnClickListener {
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }
}
