package com.example.helloworld

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
import com.example.helloworld.ui.theme.HelloWorldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HelloWorldTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "World of app development",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }

        varConst()
        tiposDatos()
    }

    private fun varConst(){
        //variables
        var nombreUsuario = "Hello world primera variable"
        println(nombreUsuario)

        nombreUsuario= "Segundo intento por logcat"
        println(nombreUsuario)

        val diaSemana="lunes"
        println(diaSemana)
    }

    private fun tiposDatos(){
        val cadena="esto es un string"
        val numero=1
        val float=1.23
        val verdadero=true
        val falso=false
        if (verdadero==falso){
            println("Esto es un error")
        }else if(verdadero!=falso){
            println("Ahora se imprime esto y nunca el else")
        }else{
            println("esto se imprime")
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloWorldTheme {
        Greeting("Android")
    }

}