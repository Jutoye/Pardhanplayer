package com.pardhancodes.pardhanplayer

import android.app.PictureInPictureParams
import android.os.Build
import android.os.Bundle
import android.util.Rational
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme(
                colorScheme = darkColorScheme(
                    background = Color(0xFF000000),
                    surface = Color(0xFF090A10),
                    primary = Color(0xFF3B82F6),
                    secondary = Color(0xFF8B5CF6)
                )
            ) {
                Surface(modifier = Modifier.fillMaxSize().background(Color.Black)) {
                    Text(
                        text = "Pardhan Player — Powered by PardhanCode",
                        color = Color.White
                    )
                }
            }
        }
    }

    fun enterVideoPip(width: Int, height: Int) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val ratio = Rational(width.coerceAtLeast(1), height.coerceAtLeast(1))
            val params = PictureInPictureParams.Builder().setAspectRatio(ratio).build()
            enterPictureInPictureMode(params)
        }
    }
}
