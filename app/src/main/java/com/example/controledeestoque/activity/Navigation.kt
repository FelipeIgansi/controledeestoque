package com.example.controledeestoque.activity

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.controledeestoque.repository.SessionManager
import com.example.controledeestoque.tools.Routes

class Navigation {
    private lateinit var navController: NavHostController

    private fun NavGraphBuilder.composableScreen(route: String) {
        composable(route) {
            CallScaffold(
                navController = navController,
            ).buildScreen(route)
        }
    }

    @Composable
    fun create() {
        navController = rememberNavController()

        val startDestination = SessionManager(LocalContext.current).fetchAuthenticationStage()

        if (!startDestination.isNullOrEmpty()) {
            NavHost(
                navController = navController,
                startDestination = startDestination
            ) {
                composableScreen(Routes.Login.route)
                composableScreen(Routes.CreateAccount.route)
                composableScreen(Routes.CreateProduct.route)
                composableScreen(Routes.EditProduct.route)
                composableScreen(Routes.ListProduct.route)
            }
        }
    }
}