package com.example.musicwiki

import com.example.musicwiki.models.GetGenres
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface LastFmApi {

    companion object {
        const val URL = "http://ws.audioscrobbler.com"
    }

    @GET("/2.0")
    suspend fun getGenres(
        @Query("method") method: String = "tag.getTopTags",
        @Query("api_key") api_key: String,
        @Query("format") format: String = "json"
    ): Response<GetGenres.Response>
}