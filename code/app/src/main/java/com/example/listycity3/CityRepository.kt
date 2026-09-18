package com.example.listycity3
import androidx.compose.runtime.mutableStateListOf
class CityRepository {
    private val _cities = mutableStateListOf(
        City("Edmonton", "AB"),
        City("Vancouver", "BC"),
        City("Toronto", "ON")
    )
    fun addCity(city: City) {
        _cities.add(city)
    }

    fun updateCity(
        oldCity: String,
        oldProvince: String,
        newCity: City
    ) {
       val index = _cities.indexOfFirst {
           it.name == oldCity && it.province == oldProvince
       }
        if (index != -1){
            _cities[index] = newCity
        }

    }

    val cities: List<City>
        get() = _cities
}