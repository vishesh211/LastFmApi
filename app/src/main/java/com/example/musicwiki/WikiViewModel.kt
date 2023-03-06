package com.example.musicwiki

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.io.IOException
import javax.inject.Inject

@HiltViewModel
class WikiViewModel @Inject constructor(
    private val lastFmApi: LastFmApi
): ViewModel() {

    fun getGenres() {
        viewModelScope.launch {
            try {
                val genreList = lastFmApi.getGenres(api_key = "3ec4da6005c36f71fdc94b95f46869d6").body()?.toptags?.tag
                print("GenreList: ${genreList?.first()}")
                Log.d("WikiViewModel", "getGenres: $genreList")
            }catch (e: IOException) {
                print("Api not working.")
                return@launch
            }
        }
    }
}