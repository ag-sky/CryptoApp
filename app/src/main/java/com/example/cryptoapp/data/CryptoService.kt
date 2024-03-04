package com.example.cryptoapp.data

import com.example.cryptoapp.data.model.CryptoResponse
import retrofit2.http.GET

interface CryptoService {
    @GET("ac7d7699-a7f7-488b-9386-90d1a60c4a4b")
    suspend fun getCryptocurrencies(): CryptoResponse
}