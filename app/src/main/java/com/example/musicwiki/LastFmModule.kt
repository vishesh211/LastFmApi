package com.example.musicwiki

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LastFmModule {

    @Provides
    @Singleton
    fun provideLastFmApi(
        retrofit: Retrofit
    ): LastFmApi = retrofit.create(LastFmApi::class.java)
}