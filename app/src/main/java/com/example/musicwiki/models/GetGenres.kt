package com.example.musicwiki.models

import com.squareup.moshi.Json
import se.ansman.kotshi.JsonSerializable

object GetGenres {

    @JsonSerializable
    data class Response(
        @Json(name = "name") val name: String,
        @Json(name = "count") val count: Int,
        @Json(name = "url") val url: String
    )
}