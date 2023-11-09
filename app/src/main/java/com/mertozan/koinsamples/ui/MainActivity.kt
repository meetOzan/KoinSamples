package com.mertozan.koinsamples.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mertozan.koinsamples.databinding.ActivityMainBinding
import org.koin.android.ext.android.inject
import org.koin.core.component.KoinComponent

class MainActivity : AppCompatActivity(), KoinComponent {


    private val myViewModel: MainViewModel by inject()

    private lateinit var binding: ActivityMainBinding

    private var personInfo = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        observeUi()
    }

    private fun observeUi() {
        myViewModel.personList.value.forEach { personList ->
            personInfo += personList.name + " " + personList.age + " \n"
        }
        binding.tvPerson.text = personInfo
    }
}