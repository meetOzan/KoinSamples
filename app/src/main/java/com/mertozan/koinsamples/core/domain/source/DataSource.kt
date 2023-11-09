package com.mertozan.koinsamples.core.domain.source

import com.mertozan.koinsamples.core.data.dto.Person

fun interface DataSource {

    suspend fun personList() : List<Person>

}