package com.example.hw1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hw1.databinding.ActivityMainBinding
import com.example.hw1.mvp.MainPresenter
import com.example.hw1.mvp.MainView

class MainActivity : AppCompatActivity(), MainView {

    private lateinit var binding: ActivityMainBinding

    private val presenter = MainPresenter(this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCounter1.setOnClickListener { presenter.counter1Click() }
        binding.btnCounter2.setOnClickListener { presenter.counter2Click() }
        binding.btnCounter3.setOnClickListener { presenter.counter3Click() }

    }

    override fun setButton1Text(text: String) {
        binding.btnCounter1.text = text
    }

    override fun setButton2Text(text: String) {
        binding.btnCounter2.text = text
    }

    override fun setButton3Text(text: String) {
        binding.btnCounter3.text = text
    }
}
