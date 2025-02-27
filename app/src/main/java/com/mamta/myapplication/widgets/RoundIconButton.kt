package com.mamta.myapplication.widgets

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

val IconbuttonSizeModifier = Modifier.size(40.dp)

@Composable
fun RoundIconButton(
    modifier: Modifier,
    imageVector: ImageVector,
    onClick: () -> Unit,
    tint: Color = Color.Black.copy(alpha = 0.8f),
    backgroundColor: Color = MaterialTheme.colorScheme.onBackground,
    elevation: Dp = 4.dp
) {
    Card(
        modifier = modifier
            .padding(all = 4.dp)
            .clickable {
                onClick.invoke()
            }
            .then(IconbuttonSizeModifier),
        shape = CircleShape,
        colors = CardDefaults.cardColors(containerColor = backgroundColor),
        elevation = CardDefaults.cardElevation(defaultElevation = elevation)
    ) {
        Icon(
            imageVector = imageVector, contentDescription = "Plus or Minus icon",
            tint = tint
        )
    }
}

