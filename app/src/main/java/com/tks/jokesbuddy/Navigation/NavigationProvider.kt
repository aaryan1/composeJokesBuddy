package com.tks.jokesbuddy.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.tks.jokesbuddy.Pages.LoginPage
import com.tks.jokesbuddy.Pages.MobilePage
import com.tks.jokesbuddy.Pages.profilePage

@Composable
fun mNavigation()
{
    val mNavController= rememberNavController()

    NavHost(navController = mNavController, startDestination= NavigationGraph.LoginPage.route)
    {
        composable(route=NavigationGraph.LoginPage.route)
        {
            //navController.navigate(NavigationGraph.LoginPage.route)
            LoginPage(navController=mNavController)
        }
        composable(route =NavigationGraph.ProfilePage.route)
        {
            profilePage(navController =mNavController )
        }
        composable(route = NavigationGraph.MobilePage.route)
        {
            MobilePage(navController = mNavController)
        }


    }

}