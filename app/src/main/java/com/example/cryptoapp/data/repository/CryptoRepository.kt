package com.example.cryptoapp.data.repository

import com.example.cryptoapp.data.CryptoService
import com.example.cryptoapp.data.model.CryptoData
import javax.inject.Inject

class CryptoRepository @Inject constructor(
    private val cryptoService: CryptoService
) {
    suspend fun getCryptocurrencies(): List<CryptoData> {
        return cryptoService.getCryptocurrencies().cryptocurrencies
    }
}