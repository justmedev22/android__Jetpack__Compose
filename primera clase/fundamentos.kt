// variables en kotlin
var Nombres = "Luis Angel"
var apellidos = "Salvatierra"
// iniciar variables y tipo
var edad: Int = 28  
var altura: Double = 1.65
var activo: Boolean = true
// el float va con la f al final
var color: Float = 4.5f

// definir funciones 
// funcion , nombre__funcion(parametro){}
fun imprimir(mensaje:String){
    Log.i(tag: "imprimir", mensaje)
}

fun operacion(numero1: Int, numero2: Int, operador:String): String {
    return "Resultado final"
}

// condicionales
var resultado = 0
if(operador == "+") {
    resultado = numero1 + numero2
}else if(operador == "-") {
    resultado = numero1 - numero2
}else if(operador == "/") {
    resultado = numero1 / numero2
}else if(operador == "*") {
    resultado = numero1 * numero2
}else {
    resultado = 0
}

// funciones
fun validarNumero(numero: Int): String{
    var resultado = when(numero % 2){
        0 -> "Numero es par"
        else -> "Numero impar"
    }
}// tambien se puede hacer el return directo
fun validarNumero(numero: Int): String{
    return = when(numero % 2){
        0 -> "Numero es par"
        else -> "Numero impar"
    }
}

