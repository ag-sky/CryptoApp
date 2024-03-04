package com.example.cryptoapp.data.model

import com.google.gson.annotations.SerializedName

data class CryptoResponse(
    @SerializedName("cryptocurrencies")
    val cryptocurrencies: List<CryptoData>
)
