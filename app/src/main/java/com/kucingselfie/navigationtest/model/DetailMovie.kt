package com.kucingselfie.navigationtest.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DetailMovie(
    val id: Int,
    val title: String,
    val description: String,
    val image: Int
) : Parcelable