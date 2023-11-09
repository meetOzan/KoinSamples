package com.mertozan.koinsamples.core.data.source

import com.mertozan.koinsamples.core.data.dto.Person
import com.mertozan.koinsamples.core.domain.source.DataSource

class DataSourceImpl : DataSource {

    override suspend fun personList(): List<Person> {
        return listOf(
            Person(1,"Ataberk",23),
            Person(2,"Merzan",21),
            Person(3,"Mustafa",21),
            Person(4,"Melih",22),
            Person(5,"İshak",21),
            Person(6,"Yade",22),
            Person(7,"Berkay",22),
            Person(8,"Aytek",22),
        )
    }

}