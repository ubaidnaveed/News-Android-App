package com.example.newsinshort.ui.viewmodel

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor() : ViewModel() {

    init{
        Log.d(TAG, "init block for NewsViewModel")
    }

    companion object {
        const val  TAG = "NewsViewModel"
    }
}