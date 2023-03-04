package com.example.musicwiki.dataclasses

import com.google.gson.annotations.SerializedName

data class TagsX(
    @SerializedName("@attr")
    val attr: AttrXXXXXX,
    val tag: List<TagX>
)