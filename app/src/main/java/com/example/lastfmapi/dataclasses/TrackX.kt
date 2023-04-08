package com.example.lastfmapi.dataclasses

import com.google.gson.annotations.SerializedName

data class TrackX(
    @SerializedName("@attr")
    val attr: AttrXXXXXXX,
    val artist: ArtistXXX,
    val duration: Int,
    val name: String,
    val streamable: StreamableX,
    val url: String
)