package com.delalic.androidcommuinity.favoritecity

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class City(
    val id: Int,
    @StringRes val nameResourceId: Int,
    @DrawableRes val imageResourceId: Int
)