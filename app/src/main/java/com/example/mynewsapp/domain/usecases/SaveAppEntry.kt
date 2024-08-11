package com.example.mynewsapp.domain.usecases

import com.example.mynewsapp.domain.manager.LocalUserManager

class SaveAppEntry (private val localUserManager:LocalUserManager){
    suspend operator fun invoke(){
        localUserManager.saveAppEntry()
    }

}