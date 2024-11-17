package com.example.newsinshort

import android.app.Application
import android.nfc.Tag
import android.util.Log
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class NewsApplication : Application(){

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "Comming inside onCreate")
    }

    companion object{
        const val TAG = "NewsApplication"
    }
}