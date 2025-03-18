package com.example.weather.api

sealed class NetworkResponse<out T> {
    data class Success<out T>(val data: T): NetworkResponse<T>()
    data class Error(val msg: String): NetworkResponse<Nothing>()
    object Loading: NetworkResponse<Nothing>()
}