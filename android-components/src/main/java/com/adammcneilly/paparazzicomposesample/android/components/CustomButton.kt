package com.adammcneilly.paparazzicomposesample.android.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * This is meant to simulate a custom button in my design system.
 */
@Composable
fun CustomButton(
    text: String,
) {
    Button(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(0.5F),
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp),
    ) {
        Text(
            text = text,
        )
    }
}
