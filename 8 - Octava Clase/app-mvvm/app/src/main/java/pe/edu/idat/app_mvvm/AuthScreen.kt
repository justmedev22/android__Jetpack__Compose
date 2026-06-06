package pe.edu.idat.app_mvvm

import android.R.attr.password
import android.annotation.SuppressLint
import android.app.Activity
import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import pe.idat.appmvvm.auth.AuthViewModel

@Composable
fun authScreen(authViewModel: AuthViewModel) {
    Scaffold { paddiingInit ->
        Box( modifier = Modifier
            .padding(paddiingInit)
            .fillMaxSize()) {
            cabecera(modifier = Modifier.align(Alignment.TopEnd) )
            cuerpo(modifier = Modifier.align(Alignment.Center), authViewModel = authViewModel )

        }
    }
}



@Composable
fun cuerpo(modifier: Modifier, authViewModel: AuthViewModel) {
    val usuario: String by authViewModel.usuario.observeAsState(initial = "")
    val password: String by authViewModel.password.observeAsState(initial = "")

    Column (modifier = modifier.padding(start = 10.dp, end = 10.dp)) {
        Spacer(modifier = Modifier.size(15.dp))
        txtusuario(usuario) { authViewModel.onLoginTextChanged( it, password ) }
        Spacer(modifier = Modifier.size(15.dp))
        txtpassword(password) { authViewModel.onLoginTextChanged( usuario, it ) }
        authbutton(authViewModel)
    }
}


@Composable
fun txtusuario(usuario: String, onTextChanged: (String) -> Unit) {
    OutlinedTextField(
        value = usuario,
        onValueChange = { onTextChanged(it) },
        modifier = Modifier.fillMaxWidth(),
        label = { Text(text = "Usuario") },
        maxLines = 1,
        singleLine = true
    )
}


@Composable
fun txtpassword(password: String, onTextChanged: (String) -> Unit) {
    OutlinedTextField(
        value = password,
        onValueChange = { onTextChanged(it) },
        modifier = Modifier.fillMaxWidth(),
        label = { Text(text = "Contraseña") },
        maxLines = 1,
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
    )
}

@SuppressLint("ContextCastToActivity")
@Composable
fun cabecera(modifier: Modifier) {
    val activity = LocalContext.current as Activity
    Icon(imageVector = Icons.Default.Close
        , contentDescription = "Cerrar",
        modifier = modifier.clickable { activity.finish() })
}


@Composable  // el profe explica pero xd lo intente
fun authbutton( authViewModel: AuthViewModel){
    Button( onClick = {
        Log.i("LOGINMVVM", authViewModel.autentificarUsuario().toString())
        }) {
        Text(text = "Validar")
    }
}


