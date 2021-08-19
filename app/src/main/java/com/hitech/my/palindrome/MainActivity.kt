package com.hitech.my.palindrome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.hitech.my.palindrome.constant.Message
import com.hitech.my.palindrome.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.viewModel = viewModel
        addObservable()
    }

    private fun addObservable() {
        viewModel.result.observe(this, { result ->
            Toast.makeText(this, result.message, Toast.LENGTH_SHORT).show()
        }
        )
    }
}