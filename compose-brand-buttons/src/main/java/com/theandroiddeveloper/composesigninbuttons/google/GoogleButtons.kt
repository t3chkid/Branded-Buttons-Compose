package com.theandroiddeveloper.composesigninbuttons.google

import androidx.compose.foundation.BorderStroke
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ButtonElevation
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import com.theandroiddeveloper.composesigninbuttons.BrandButton
import com.theandroiddeveloper.composesigninbuttons.BrandedButtonType

// TODO add button image for each composable in its documentation
@Composable
fun DarkGoogleButton(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = LocalTextStyle.current,
    enabled: Boolean = true,
    elevation: ButtonElevation? = ButtonDefaults.elevation(),
    shape: Shape = MaterialTheme.shapes.small,
    border: BorderStroke? = null,
) {
    BrandButton(
        brandedButtonType = BrandedButtonType.DarkGoogleButton,
        label = label,
        textStyle = textStyle,
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        elevation = elevation,
        shape = shape,
        border = border
    )
}

@Composable
fun LightGoogleButton(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = LocalTextStyle.current,
    enabled: Boolean = true,
    elevation: ButtonElevation? = ButtonDefaults.elevation(),
    shape: Shape = MaterialTheme.shapes.small,
    border: BorderStroke? = null,
) {
    BrandButton(
        brandedButtonType = BrandedButtonType.LightGoogleButton,
        label = label,
        textStyle = textStyle,
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        elevation = elevation,
        shape = shape,
        border = border
    )
}