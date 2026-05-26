package pe.edu.idat.appcomponentsadvanced

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog


@Composable
fun PruebaTextoCambiante (   // codiog propio
    btnText: Boolean,
    onDisniss: () -> Unit
) {
        if ( btnText )   {
            Dialog( onDismissRequest = { onDisniss()  } ) {
                Box(
                    contentAlignment = Alignment.Center){
                    Text(text = "xd")
                }
            }
        }
}


@Composable
fun EjemploDialogAdavance(
    mostrar3: Boolean,
    onDisniss: () -> Unit
) {
    if (mostrar3) {
        Dialog(onDismissRequest = { onDisniss() }) {
            Column(
                Modifier
                    .background(Color.White)
                    .padding(24.dp)
                    .fillMaxWidth()
            ) {
                tituloDialog(titulo = "Elegir un email: ")
                itemOption(email = "ejemplo@gmail.com", drawble = R.drawable.ic_launcher_foreground)
                itemOption(email = "ejemplo@gmail.com", drawble = R.drawable.ic_launcher_background)
                itemOption(email = "ejemplo@gmail.com", drawble = R.drawable.ic_launcher_foreground)
                itemOption(email = "Añadir nuevo", drawble = R.drawable.ic_launcher_foreground)
            }
        }
    }
}


// parte del codigo que sera usada como componente de otro
@Composable //
fun itemOption(email: String, @DrawableRes drawble: Int) {
    TextButton(onClick = { }) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = drawble),
                contentDescription = "img",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(8.dp)
                    .size(40.dp)
                    .clip(CircleShape)
            )
            Text(
                text = email, fontSize = 14.sp,
                color = Color.Gray, modifier = Modifier.padding(8.dp))
        }
    }
}


@Composable
fun EjemploDialogConfirmation(
    mostrar2: Boolean,
    onDisniss: () -> Unit
) {
    if (mostrar2) {
        Dialog(onDismissRequest = { onDisniss }) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {// aca se esta usando ese elemento
                tituloDialog(titulo = "titulo prueba", Modifier.padding(24.dp))
                HorizontalDivider(
                    Modifier.fillMaxWidth(),
                    color = Color.LightGray
                )
                Row(
                    modifier = Modifier
                        .align(Alignment.End)
                        .padding(8.dp)
                ) {
                    TextButton(onClick = { onDisniss() }) {
                        Text(text = "Cancelar")
                    }
                    TextButton(onClick = { onDisniss() }) {
                        Text(text = "OK")
                    }
                }
            }
        }
    }
}


@Composable // se usa este elemento mas adelante
fun tituloDialog(
    titulo: String,
    modifier: Modifier = Modifier.padding(bottom = 12.dp)
) {
    Text(
        text = titulo,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
        modifier = modifier
    )
}


@Composable
// genera una especie de mensaje en la pantalla
fun EjemploDialogBasic(
    mostrar: Boolean,
    onDisniss: () -> Unit,
    onConfirm: () -> Unit
) {
    if (mostrar) {
        AlertDialog(
            onDismissRequest = { onDisniss },
            confirmButton = {
                TextButton(onClick = { onConfirm }) {
                    Text(text = "Confirmar")
                }
            },
            dismissButton = {
                TextButton(onClick = { onDisniss }) {
                    Text(text = "Cerrar")
                }
            },
            title = { Text(text = "Titulo Dialog") },
            text = { Text(text = "Hola soy un Dialog Compose") }
        )
    }

}