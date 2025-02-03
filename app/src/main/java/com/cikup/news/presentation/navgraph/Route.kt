package com.cikup.news.presentation.navgraph

import androidx.navigation.NamedNavArgument

sealed class Route(
    val route: String,
    val arguments: List<NamedNavArgument> = emptyList()
) {
    object AppStartNavigation: Route(route = "AppStartNavigation")

    object OnBoardingScreen: Route(route = "OnBoardingScreen")

    object NewsNavigation: Route(route = "NewsNavigation")

    object NewsNavigatorScreen: Route(route = "NewsNavigatorScreen")

    object HomeScreen: Route(route = "HomeScreen")

    object SearchScreen: Route(route = "SearchScreen")

    object BookmarkScreen: Route(route = "BookmarkScreen")

    object DetailsScreen: Route(route = "DetailsScreen")
}