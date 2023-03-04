package com.example.musicwiki.dataclasses

import com.google.gson.annotations.SerializedName

data class TrackX(
    @SerializedName("@attr")
    val attr: AttrXXXXXX,
    val artist: ArtistXXXX,
    val duration: String,
    val image: List<ImageXXX>,
    val mbid: String,
    val name: String,
    val streamable: StreamableX,
    val url: String
)