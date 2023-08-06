package com.delalic.androidcommuinity.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.delalic.androidcommuinity.R
import com.delalic.androidcommuinity.favoritecity.City
import com.delalic.androidcommuinity.favoritecity.CityDataSource

@Preview(showBackground = true)
@Composable
private fun CityCardPreview() {
    CityApp()
}

@Composable
fun CityApp() {
    CityList(cityList = CityDataSource().loadCities())
}

@Composable
fun CityList(cityList: List<City>) {
    LazyColumn {
        items(items = cityList, itemContent = { city -> CityCard(city = city) })
    }
}

@Composable
fun CityCard(city: City) {
    Card(
        modifier = Modifier.padding(10.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Column {
            Image(
                painter = painterResource(city.imageResourceId),
                contentDescription = stringResource(R.string.city_images),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(154.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = LocalContext.current.getString(city.nameResourceId),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineLarge
            )
        }
    }
}