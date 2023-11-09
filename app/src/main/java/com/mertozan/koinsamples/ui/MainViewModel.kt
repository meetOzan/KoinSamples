package com.mertozan.koinsamples.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mertozan.koinsamples.core.data.dto.Person
import com.mertozan.koinsamples.core.domain.usecase.GetPersonDataUseCase
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent

class MainViewModel(private val getPersonDataUseCase: GetPersonDataUseCase) :
    ViewModel(), KoinComponent {

    private val _personList = MutableLiveData(emptyList<Person>())
    val personList: LiveData<List<Person>> get() = _personList

    init {
        getAllPerson()
    }

    fun getAllPerson() {
        viewModelScope.launch {
            _personList.postValue(getPersonDataUseCase())
            Log.e("Name", getPersonDataUseCase()[2].name)
        }
    }
}