package pe.edu.idat.Appinitcompose

import android.content.res.Configuration
import android.os.Message
import androidx.compose.foundation.horizontalScroll

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pe.edu.idat.Appinitcompose.ui.theme.AppinitcomposeTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource


// este codigo permite que se ponga en modo oscuro
 // @Preview(name = "Light Mode")  // <- esta linea hace el cambio
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,  // este sirve que se muestre el cambio
    name = "Dark Mode"
)
@Composable
fun GreetingPreview() {
    AppinitcomposeTheme {
        // ejemploRow()
        // MessageCard("android")
        // MessageCard("Jacob")
        // ListaImage() // parte de botones
        prueba()
    }
}


@Composable
fun ejemploRow(){
    Row(
        // fill para definir la altura , ancho , que tome todo max size
        modifier = Modifier
            .fillMaxSize()
            .horizontalScroll(rememberScrollState())
            .padding(top = 40.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Text(
           text = "Hola mundo, compose",
            modifier = Modifier.width(100.dp)
        )
        Text(
            text = "Hola mundo, compose",
            modifier = Modifier.width(100.dp)
        )
        Text(
            text = "Hola mundo, compose",
            modifier = Modifier.width(100.dp)
        )
        Text(
            text = "Hola mundo, compose",
            modifier = Modifier.width(100.dp)
        )
        Text(
            text = "Hola mundo, compose",
            modifier = Modifier.width(100.dp)
        )


    }
}


@Composable
fun MessageCard(name: String) {
    Text(
        text = "Hello $name!",
        modifier = Modifier
            .padding(top = 20.dp)
            .padding(bottom = 30.dp)
    )
}

@Composable
fun ListaImage(){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier =  Modifier
                .weight(.5f)
                .padding(40.dp),
            verticalArrangement = Arrangement.Center, // eje vertical
            horizontalAlignment = Alignment.CenterHorizontally // eje horizontal
        ) {
            Text("Hola")
            Button(onClick = {}) {
                Text("Botón")
            }
            Text("Hola")
            Button(onClick = {}) {
                Text("Botón")
            }
            Text("Hola")
            Button(onClick = {}) {
                Text("Botón")
            }
            Text("Hola")
            Button(onClick = {}) {
                Text("Botón")
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceAround,
        ) {
            Text("Izquierda")
            Text("Derecha")
        }
    }
}

@Composable
fun prueba() {
    Column (
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
            .padding(top = 15.dp)

    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
                .background(color = Color(0xFF6200EE)),

                //.padding(top = 20.dp)
        )
        {
            Text(
                text = "Header",
                modifier = Modifier
                    .border(2.dp, Color.Black)
                    .shadow(8.dp)
                    .padding(20.dp),
                    color = Color.White


            )
        }

        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,

        ) {
            Text(
                text = "Texto centrado",
                modifier = Modifier.background(Color.LightGray)
               )
            Text(
                text = "(Hola mundo)"
            )
        }
        Row (
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
                    .padding(30.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "perfil",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(10.dp)) // ← AQUÍ
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            )
            {
                Row (
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()

                ) {
                    Text(
                        text = "Kenshi CPP"
                    )
                    Spacer(modifier = Modifier.width(80.dp)) // ← AQUÍ
                    Text(
                        text = "18:55 pm"
                    )
                }
                Text(
                    text = "Perdi 5 Ranks"
                )
            }

        }
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 40.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = "btn1"
            )
            Text(
                text = "btn2"
            )
        }
    }



}




/*
@Composable
fun ItemContacto(nombre: String, descripcion: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        // Imagen circular
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "imagen",
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.width(12.dp))

        // Textos (columna dentro del row)
        Column {
            Text(text = nombre)
            Text(text = descripcion)
        }
    }
}
*/


/*
data class Message(val author: String, val body: String)

@Composable
fun MessageCard(msg: Message) {
    Text(text = msg.author)
    Text(text = msg.body)
}

@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard(
        msg = Message("Lexi", "Hey, take a look at Jetpack Compose, it's great!")
    )
}  */


/*
 que tipo de codigo hexadecimal 0xAARRGGBB

esto de aqui define como llamar una imagen?
painter??
painter = painterResource(id = R.drawable.tu_imagen),

.clip(CircleShape) mas informacion

como escalado
contentScale = ContentScale.Crop




 */



