package com.example.musicwiki.dataclasses

import com.google.gson.annotations.SerializedName

data class AlbumX(
    @SerializedName("@attr")
    val attr: AttrXXXXXX,
    val artist: ArtistXXX,
    val image: List<ImageXX>,
    val mbid: String,
    val name: String,
    val url: String
)