package com.example.lastfmapi.dataclasses

import com.google.gson.annotations.SerializedName

data class ImageXX(
    @SerializedName("#text")
    val text: String,
    val size: String
)