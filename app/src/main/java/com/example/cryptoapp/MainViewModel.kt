package com.example.cryptoapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cryptoapp.data.model.CryptoData
import com.example.cryptoapp.data.repository.CryptoRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(private val repository: CryptoRepository) : ViewModel() {

    private val _cryptoList = MutableLiveData<List<CryptoData>>()
    val cryptoList: LiveData<List<CryptoData>> = _cryptoList

    init {
        fetchCryptocurrencies()
    }

    private fun fetchCryptocurrencies() {
        viewModelScope.launch {
            try {
                val cryptocurrencies = repository.getCryptocurrencies()
                _cryptoList.postValue(cryptocurrencies)
            } catch (e: Exception) {
            }
        }
    }
}