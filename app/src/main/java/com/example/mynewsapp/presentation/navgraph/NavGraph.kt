package com.example.mynewsapp.presentation.navgraph

import android.util.Log
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.example.mynewsapp.presentation.onboarding.OnBoardingScreen
import com.example.mynewsapp.presentation.onboarding.OnBoardingViewModel
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import androidx.navigation.compose.composable
import androidx.paging.compose.collectAsLazyPagingItems
import com.example.mynewsapp.presentation.bookmark.BookMarkScreen
import com.example.mynewsapp.presentation.bookmark.BookMarkViewModel
import com.example.mynewsapp.presentation.home.HomeScreen
import com.example.mynewsapp.presentation.home.HomeViewModel
import com.example.mynewsapp.presentation.newsNavigator.components.NewsNavigator
import com.example.mynewsapp.presentation.search.SearchScreen
import com.loc.newsapp.presentation.search.SearchViewModel


@Composable
fun NavGraph(startDestination: String) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = startDestination) {
        navigation(
            route = Route.AppStartNavigation.route, startDestination = Route.OnBoardingScreen.route
        ) {
            composable(
                route = Route.OnBoardingScreen.route,
            ) {
                val viewModel: OnBoardingViewModel = hiltViewModel()
                OnBoardingScreen(
                    event = viewModel::onEvent
                )
            }
        }
        navigation(
            route = Route.NewsNavigation.route,
            startDestination = Route.NewsNavigatorScreen.route,
        ) {
            composable(
                route = Route.NewsNavigatorScreen.route
            ) {
               NewsNavigator()
            }
        }
    }
}