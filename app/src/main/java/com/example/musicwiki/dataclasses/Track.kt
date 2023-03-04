package com.example.musicwiki.dataclasses

data class Track(
    val @attr: Attr,
    val artist: Artist,
    val duration: Int,
    val name: String,
    val streamable: Streamable,
    val url: String
)