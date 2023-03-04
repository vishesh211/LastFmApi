package com.example.musicwiki.dataclasses

import com.google.gson.annotations.SerializedName

data class Toptags(
    @SerializedName("@attr")
    val attr: AttrXXXXXX,
    val tag: List<TagXX>
)