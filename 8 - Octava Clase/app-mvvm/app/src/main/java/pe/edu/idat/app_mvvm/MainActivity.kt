package pe.edu.idat.app_mvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import pe.edu.idat.app_mvvm.home.home
import pe.edu.idat.app_mvvm.model.Routes
import pe.edu.idat.app_mvvm.ui.theme.AppmvvmTheme
import pe.idat.appmvvm.auth.AuthViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppmvvmTheme {
                val navigation = rememberNavController()
                NavHost(
                    navController = navigation,
                    startDestination = Routes.LoginScreen.path,
                    builder = {
                        composable(Routes.LoginScreen.path) {
                            authScreen(AuthViewModel(), navigation)
                        }
                        composable(
                            Routes.homeScreen.path,
                            arguments = listOf(navArgument("id") { type = NavType.IntType })
                        ) { params ->
                            home(
                                navController = navigation,
                                id = params.arguments?.getInt("id") ?: 0
                            )
                        }

                    })
            }
        }
    }


    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        AppmvvmTheme {

        }
    }
}