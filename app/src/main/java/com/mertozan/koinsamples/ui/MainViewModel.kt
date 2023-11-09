package com.mertozan.koinsamples.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mertozan.koinsamples.core.data.dto.Person
import com.mertozan.koinsamples.core.domain.usecase.GetPersonDataUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent

class MainViewModel(private val getPersonDataUseCase: GetPersonDataUseCase) :
    ViewModel(), KoinComponent {

    private val _personList = MutableStateFlow(emptyList<Person>())
    val personList: StateFlow<List<Person>> get() = _personList

    init {
        getAllPerson()
    }

    fun getAllPerson() {
        viewModelScope.launch {
            _personList.value = getPersonDataUseCase()
            Log.e("Name", getPersonDataUseCase()[2].name)
        }
    }
}