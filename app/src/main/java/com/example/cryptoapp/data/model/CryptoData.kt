package com.example.cryptoapp.data.model

data class CryptoData(
    val name: String,
    val symbol: String,
    val isNew: Boolean,
    val isActive: Boolean,
    val type: String
)