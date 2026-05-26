package pe.edu.idat.appnavigationscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable  // LA IDEA ES REDIRECCIONAR A LA PANTALLA B
fun PantallaB(navController: NavController) {  // esto genera una variable para usarse de guia
    Column(Modifier.padding(top = 25.dp).fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Button(onClick = {
            navController.navigate("pantallaA")

        }, colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF4CAF50), // Color de fondo del botón (Verde en este caso)
            contentColor = Color.White,         // Color del texto o iconos dentro del botón

            // Opcional: Colores para cuando el botón está desactivado (enabled = false)
            disabledContainerColor = Color.Gray,
            disabledContentColor = Color.LightGray
        )

            ) {
            Text(text = "Ir a la pantalla A")
        }
    }
}
