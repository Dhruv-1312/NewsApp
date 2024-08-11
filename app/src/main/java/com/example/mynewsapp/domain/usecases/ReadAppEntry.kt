package com.example.mynewsapp.domain.usecases

import com.example.mynewsapp.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry (private  val localUserManager: LocalUserManager){

    suspend operator fun invoke():Flow<Boolean>{
       return  localUserManager.readAppEntry()
    }

}