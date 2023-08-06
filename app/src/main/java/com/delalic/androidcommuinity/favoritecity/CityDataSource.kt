package com.delalic.androidcommuinity.favoritecity

import com.delalic.androidcommuinity.R

class CityDataSource {
    fun loadCities(): List<City> {
        return listOf<City>(
            City(1, R.string.spain, R.drawable.spain),
            City(2, R.string.new_york, R.drawable.new_york),
            City(3, R.string.san_francisco, R.drawable.ic_launcher_background),
            City(4, R.string.chicago, R.drawable.ic_launcher_background),
            City(5, R.string.spain, R.drawable.spain),
            City(6, R.string.new_york, R.drawable.new_york),
            City(7, R.string.san_francisco, R.drawable.ic_launcher_background),
            City(8, R.string.chicago, R.drawable.ic_launcher_background)
        )
    }
}