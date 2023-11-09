package com.mertozan.koinsamples.core.domain.repository

import com.mertozan.koinsamples.core.data.dto.Person

interface MainRepository {

    suspend fun getAllData() : List<Person>

}