package com.mertozan.koinsamples.core.domain.usecase

import com.mertozan.koinsamples.core.data.dto.Person
import com.mertozan.koinsamples.core.domain.repository.MainRepository

class GetPersonDataUseCase(private val mainRepository: MainRepository) {
    suspend operator fun invoke(): List<Person> {
        return mainRepository.getAllData()
    }
}