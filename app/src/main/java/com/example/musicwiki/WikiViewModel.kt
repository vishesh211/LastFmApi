package com.example.musicwiki

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WikiViewModel @Inject constructor(
    lastFmApi: LastFmApi
): ViewModel() {

}