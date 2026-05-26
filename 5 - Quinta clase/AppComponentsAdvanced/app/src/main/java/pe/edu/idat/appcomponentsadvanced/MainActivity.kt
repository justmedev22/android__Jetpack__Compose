package pe.edu.idat.appcomponentsadvanced

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pe.edu.idat.appcomponentsadvanced.ui.theme.AppComponentsAdvancedTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppComponentsAdvancedTheme {
/*
                Column(modifier = Modifier.fillMaxSize(),
                    Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                    )
                { // probando con anclaje de botones para diferencia , este nose cierra
                    var mostrar by remember{
                        mutableStateOf(false)
                    }
                    Box(modifier = Modifier.weight(1f),
                        contentAlignment = Alignment.Center,

                        ){
                        Button(onClick = { mostrar = true }) {
                            Text(text = "Mostrar Dialog")
                        }
                    }
                    EjemploDialogBasic(mostrar,
                        onDisniss = { mostrar = false },
                        onConfirm = { mostrar = false })


                    // probando anclaje de botones para diferencia
                    var mostrar2 by remember{
                        mutableStateOf(false)
                    }
                    Box(modifier = Modifier.weight(1f),
                        contentAlignment = Alignment.Center){
                        Button(onClick = { mostrar2 = true }) {
                            Text(text = "Mostrar2 Dialog")
                        }
                    }
                    EjemploDialogConfirmation(mostrar2 = mostrar2,
                        onDisniss = { mostrar2 = false })


                    // probando anclaje de botones para diferencia
                    var mostrar3 by remember{
                        mutableStateOf(false)
                    }
                    Box(modifier = Modifier.weight(1f),
                        contentAlignment = Alignment.Center){
                        Button(onClick = { mostrar3 = true }) {
                            Text(text = "Mostrar3 Dialog")
                        }
                    }
                    EjemploDialogAdavance(mostrar3 = mostrar3,
                        onDisniss = { mostrar3 = false })


                    var btnText by remember{
                        mutableStateOf(false)
                    }
                    Box(modifier = Modifier.weight(1f),
                        contentAlignment = Alignment.Center){
                        Button(onClick = { btnText = true }) {
                            Text(text = "Texto pintado")
                        }
                    }
                    PruebaTextoCambiante( btnText = btnText , onDisniss = { btnText = false })

                }

 */
                // en el video te quedaste en el min 40 justo la otra parte del codigo
        Box(modifier = Modifier.fillMaxSize().padding(top = 35.dp, start = 15.dp,
            end = 15.dp, bottom = 35.dp)) {
               // EjemploSimpleRecyclerView()
                EjemploRecicleVierItem()
        }

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppComponentsAdvancedTheme {

    }
}