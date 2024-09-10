package com.example.mynewsapp.di

import android.app.Application
import com.example.mynewsapp.data.manager.LocalUserManagerImpl
import com.example.mynewsapp.domain.manager.LocalUserManager
import com.example.mynewsapp.domain.usecases.app_entry.AppEntryUseCases
import com.example.mynewsapp.domain.usecases.app_entry.ReadAppEntry
import com.example.mynewsapp.domain.usecases.app_entry.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideLocalUserManager(
    application:Application
    ):LocalUserManager=LocalUserManagerImpl(application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(localUserManager: LocalUserManager)= AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManager),
        saveAppEntry = SaveAppEntry(localUserManager),
    )


}