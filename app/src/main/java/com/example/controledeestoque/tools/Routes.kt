package com.example.controledeestoque.tools

sealed class Routes (val route: String) {
    data object CreateAccount: Routes("createaccount")
    data object CreateProduct: Routes("createproduct")
    data object EditProduct: Routes("editproduct")
    data object ListProduct: Routes("listproduct")
    data object Login: Routes("login")
}