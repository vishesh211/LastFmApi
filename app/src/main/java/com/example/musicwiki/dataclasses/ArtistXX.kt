package com.example.musicwiki.dataclasses

import com.google.gson.annotations.SerializedName

data class ArtistXX(
    @SerializedName("@attr")
    val attr: AttrXXXXXX,
    val image: List<ImageX>,
    val mbid: String,
    val name: String,
    val streamable: String,
    val url: String
)