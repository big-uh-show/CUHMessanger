package com.cuh.data.user.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Singleton
    @Provides
    fun provideOkHttpClient() : OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(null)
            .build()
    }

    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient, url: String) : Retrofit {
        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(url)
            .addConverterFactory(null)
            .build()
    }
}