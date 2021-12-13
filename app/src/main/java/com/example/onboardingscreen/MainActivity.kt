package com.example.onboardingscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import com.example.onboardingscreen.ui.onBoarding.onBoarding
import com.example.onboardingscreen.ui.theme.OnBoardingTheme
import com.google.accompanist.pager.ExperimentalPagerApi

class MainActivity : ComponentActivity() {
    @ExperimentalPagerApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OnBoardingTheme {
                window.statusBarColor = MaterialTheme.colors.background.toArgb()
                window.navigationBarColor=MaterialTheme.colors.background.toArgb()
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    onBoarding()
                }
            }
        }
    }
}

@ExperimentalPagerApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    OnBoardingTheme {
        onBoarding()
    }
}