package com.example.musicwiki.dataclasses

import com.google.gson.annotations.SerializedName

data class AlbumsX(
    @SerializedName("@attr")
    val attr: AttrXXXXXX,
    val album: List<AlbumX>
)