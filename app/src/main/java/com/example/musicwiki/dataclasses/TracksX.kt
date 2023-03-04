package com.example.musicwiki.dataclasses

import com.google.gson.annotations.SerializedName

data class TracksX(
    @SerializedName("@attr")
    val attr: AttrXXXXXX,
    val track: List<TrackX>
)