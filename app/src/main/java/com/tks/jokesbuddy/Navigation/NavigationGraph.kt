package com.tks.jokesbuddy.Navigation

sealed class NavigationGraph(val route:String)
{
    object LoginPage: NavigationGraph("LoginPage")
    object MobilePage: NavigationGraph("MobilePage")
    object ProfilePage: NavigationGraph("ProfilePage")
}
