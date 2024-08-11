package com.example.mynewsapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import androidx.lifecycle.lifecycleScope
import com.example.mynewsapp.domain.usecases.AppEntryUseCases
import com.example.mynewsapp.presentation.onboarding.OnBoardingScreen
import com.example.mynewsapp.ui.theme.MyNewsAppTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
   @Inject
   lateinit var appEntryUseCases: AppEntryUseCases
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window,false)
        lifecycleScope.launch {
            appEntryUseCases.readAppEntry().collect{
                Log.d("Test",it.toString())
            }
        }
        setContent {
            MyNewsAppTheme {
                // A surface container using the 'background' color from the theme
                Box(modifier = Modifier.background(color = MaterialTheme.colorScheme.background))
                OnBoardingScreen()

            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

