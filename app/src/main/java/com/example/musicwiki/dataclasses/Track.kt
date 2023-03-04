package com.example.musicwiki.dataclasses

import com.google.gson.annotations.SerializedName

data class Track(
    @SerializedName("@attr")
    val attr: AttrXXXXXX,
    val artist: Artist,
    val duration: Int,
    val name: String,
    val streamable: Streamable,
    val url: String
)