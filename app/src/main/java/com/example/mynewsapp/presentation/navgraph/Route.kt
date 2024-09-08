package com.example.mynewsapp.presentation.navgraph

sealed class Route(val route:String) {
    object OnBoardingScreen : Route(route="onBoardingScreen")
    object HomeScreen:Route(route="homeScreen")
    object SearchScreen : Route(route="searchScreen")
    object BookmarkScreen:Route(route = "bookmarkScreen")
    object DetailedScreen:Route(route = "detailedScreen")
    object AppStartNavigation : Route(route="appStartNavigation")
    object NewsNavigation:Route(route = "newsNavigation")
    object NewsNavigatorScreen:Route(route = "newsNavigatorScreen")

}