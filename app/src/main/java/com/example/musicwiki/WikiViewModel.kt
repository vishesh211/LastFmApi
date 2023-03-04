package com.example.musicwiki

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import java.io.IOException

class WikiViewModel(
    private val lastFmApi: LastFmApi
): ViewModel() {

    fun getGenres() {
        viewModelScope.launch {
            try {
                val genreList = LastFmInstance.lastFmApi.getGenres(api_key = "3ec4da6005c36f71fdc94b95f46869d6").body()?.name
                print("GenreList: $genreList")
                Log.d("WikiViewModel", "getGenres: $genreList")
            }catch (e: IOException) {
                print("Api not working.")
                return@launch
            }
        }
    }
}