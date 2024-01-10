package com.example.clock_app.ui.main

import androidx.compose.runtime.mutableStateOf
import java.time.LocalTime

class ScreenState {
    val currentTime = LocalTime.now()
    val nightStartTime = mutableStateOf(LocalTime.of(19, 0))
    val nightEndTime = mutableStateOf(LocalTime.of(6, 45))
}