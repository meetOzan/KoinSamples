package com.mertozan.koinsamples.ui

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import com.mertozan.koinsamples.R
import com.mertozan.koinsamples.core.data.dto.Person
import com.mertozan.koinsamples.databinding.ActivityMainBinding
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.component.KoinComponent

class MainActivity : AppCompatActivity(), KoinComponent {


    private val myViewModel : MainViewModel by inject()
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        observeUi()

    }

    private fun observeUi(){
        myViewModel.personList.observe(this){ personList ->
            binding.tvPerson.text = "List size: ${personList.size}"
        }
    }
}