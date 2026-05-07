package pe.edu.idat.appnavigationscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

// se debe agregar esta dependencia en la carpeta gradle en la parte module
//     implementation("androidx.navigation:navigation-compose:2.7.7")
@Composable  // esto es una vista la pantalla A
fun PantallaA(navController: NavController) {  // LA IDEA ES REDIRECCIONAR A LA PANTALLA B
    Column(Modifier.padding(top = 25.dp).fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Button(onClick = {
            navController.navigate("pantallaB")
        }) {
            Text(text = "Ir a la pantalla B")
        }
    }
}






