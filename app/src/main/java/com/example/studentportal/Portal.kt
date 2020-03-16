package com.example.studentportal

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Portal(
    val name: String,
    val url:  String
) : Parcelable {
    companion object {
        val PORTAL_NAMES = arrayOf(
            "Vlo",
            "Roosters",
            "SIS",
            "HvA"
        )
        val PORTAL_URLS = arrayOf(
            "https://vlo.informatica.hva.nl",
            "https://rooster.hva.nl",
            "https://sis.hva.nl",
            "https://hva.nl"
            )
    }
}