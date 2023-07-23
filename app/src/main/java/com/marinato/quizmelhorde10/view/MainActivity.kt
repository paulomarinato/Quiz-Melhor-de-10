package com.marinato.quizmelhorde10.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.marinato.quizmelhorde10.R
import com.marinato.quizmelhorde10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonInit.setOnClickListener {
            startActivity(Intent(this, QuestionsActivity::class.java))

            val editTextNome = findViewById<EditText>(R.id.edit_person_name)
            val nickname = editTextNome.text.toString()
        }
    }
}



