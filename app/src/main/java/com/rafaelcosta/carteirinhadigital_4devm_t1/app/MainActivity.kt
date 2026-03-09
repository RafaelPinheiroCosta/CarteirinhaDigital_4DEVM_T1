package com.rafaelcosta.carteirinhadigital_4devm_t1.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rafaelcosta.carteirinhadigital_4devm_t1.feature.carteirinha.presentation.CarteirinhaScreen
import com.rafaelcosta.carteirinhadigital_4devm_t1.core.designsystem.theme.CarteirinhaDigital_4DEVM_T1Theme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarteirinhaDigital_4DEVM_T1Theme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            colors = topAppBarColors(
                                containerColor = MaterialTheme.colorScheme.primaryContainer,
                                titleContentColor = MaterialTheme.colorScheme.primary,
                            ),
                            title = {
                                Text("Carteirinha de Estudante Disital")
                            }
                        )
                    }
                ) { innerPadding ->
                    CarteirinhaScreen(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                    )
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewAppClaro() {
    CarteirinhaDigital_4DEVM_T1Theme(darkTheme = false) {
        CarteirinhaScreen()
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewAppEscuro() {
    CarteirinhaDigital_4DEVM_T1Theme(darkTheme = true) {
        CarteirinhaScreen()
    }
}