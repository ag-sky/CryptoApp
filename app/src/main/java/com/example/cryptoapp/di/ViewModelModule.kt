package com.example.cryptoapp.di

import com.example.cryptoapp.MainViewModel
import com.example.cryptoapp.data.repository.CryptoRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object ViewModelModule {

    @Provides
    @ViewModelScoped
    fun provideMainViewModel(repository: CryptoRepository): MainViewModel {
        return MainViewModel(repository)
    }
}