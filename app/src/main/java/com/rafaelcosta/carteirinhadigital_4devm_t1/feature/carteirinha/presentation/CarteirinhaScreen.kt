package com.rafaelcosta.carteirinhadigital_4devm_t1.feature.carteirinha.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rafaelcosta.carteirinhadigital_4devm_t1.R
import com.rafaelcosta.carteirinhadigital_4devm_t1.feature.carteirinha.presentation.component.LabelText
import com.rafaelcosta.carteirinhadigital_4devm_t1.feature.carteirinha.presentation.component.QrCode
import com.rafaelcosta.carteirinhadigital_4devm_t1.feature.carteirinha.presentation.component.ValueText


@Composable
fun CarteirinhaScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
    ) {
        Image(
            painter = painterResource(R.drawable.plano_de_fundo),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .alpha(.7f)
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.senai_s_o_paulo_logo),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth(.6f)
                    .background(color = Color.Blue)
            )
            Spacer(
                modifier = Modifier
                    .weight(.3f)
            )
            Image(
                painter = painterResource(R.drawable.avatar_login),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .weight(2f)
                    .fillMaxWidth(.6f)
                    .clip(CircleShape)
                    .aspectRatio(1f)
            )
            Row(
                modifier = Modifier
                    .weight(.2f)
                    .fillMaxWidth(.9f),
                verticalAlignment = Alignment.CenterVertically
            ) {
                LabelText(
                    "Nome",
                    modifier = Modifier.weight(1f)
                )
                ValueText(
                    value = "Rafael Costa",
                    modifier = Modifier.weight(4f)
                )
            }
            Row(
                modifier = Modifier
                    .weight(.6f)
                    .fillMaxWidth(.9f),
                verticalAlignment = Alignment.CenterVertically
            )
            {
                LabelText(
                    "Curso",
                    modifier = Modifier.weight(1f)
                )
                ValueText(
                    value = "Técnico Desenvolvedor de Sistemas",
                    fontWeight = FontWeight.Normal,
                    fontSize = 20.sp,
                    modifier = Modifier.weight(4f)
                )
            }
            QrCode(
                conteudo = "seunumerodematriculaaqui",
                modifier = Modifier
                    .weight(2f)
                    .fillMaxWidth(.6f)
            )
        }
    }
}
