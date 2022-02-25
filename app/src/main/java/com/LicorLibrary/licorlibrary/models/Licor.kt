package com.LicorLibrary.licorlibrary.models

import java.io.Serializable

data class Licor(
    val name: String,
    val author: String,
    val Capacity: Int,
    val Description: String,
    val PublicationDate: String
) : Serializable
