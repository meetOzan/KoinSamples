package com.mertozan.koinsamples.core.data.di

import com.mertozan.koinsamples.core.data.repository.MainRepositoryImpl
import com.mertozan.koinsamples.core.data.source.DataSourceImpl
import com.mertozan.koinsamples.core.domain.repository.MainRepository
import com.mertozan.koinsamples.core.domain.source.DataSource
import com.mertozan.koinsamples.core.domain.usecase.GetPersonDataUseCase
import com.mertozan.koinsamples.ui.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single<MainRepository> { MainRepositoryImpl(get()) }

    single<DataSource> { DataSourceImpl() }

    viewModel { MainViewModel(get()) }

    single { GetPersonDataUseCase(get()) }
}