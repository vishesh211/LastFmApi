package com.example.musicwiki.dataclasses

import com.google.gson.annotations.SerializedName

data class Topartists(
    @SerializedName("@attr")
    val attr: AttrXXXXXX,
    val artist: List<ArtistXX>
)