package pe.edu.idat.app_mvvm.model

sealed class Routes(val path: String) {
    object LoginScreen: Routes("loginScreen")
    object homeScreen: Routes("homeScreen/{id}"){
        fun paramHome(id: Int) = "homeScreen/$id"
    }
}