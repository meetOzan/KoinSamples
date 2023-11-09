package com.mertozan.koinsamples.core.data.repository

import com.mertozan.koinsamples.core.data.dto.Person
import com.mertozan.koinsamples.core.domain.repository.MainRepository
import com.mertozan.koinsamples.core.domain.source.DataSource

class MainRepositoryImpl(private val dataSource: DataSource) : MainRepository {

    override suspend fun getAllData(): List<Person> {
        return dataSource.personList()
    }
}