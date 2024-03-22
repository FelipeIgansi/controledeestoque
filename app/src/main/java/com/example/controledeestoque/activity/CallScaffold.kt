package com.example.controledeestoque.activity

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.controledeestoque.tools.Routes

class CallScaffold(private val navController: NavHostController) {
    @Composable
    fun buildScreen(screen: String):PaddingValues {
        Scaffold(
            topBar = {}
        ){ padding ->
            when(screen){
                Routes.Login.route -> Login(padding)
                Routes.CreateAccount.route -> CreateAccount(padding)
                Routes.CreateProduct.route -> CreateProduct(padding)
                Routes.ListProduct.route -> ListProduct(padding)
                Routes.EditProduct.route -> EditProduct(padding)
                else->{}
            }
            return@Scaffold
        }
        return PaddingValues()
    }
}