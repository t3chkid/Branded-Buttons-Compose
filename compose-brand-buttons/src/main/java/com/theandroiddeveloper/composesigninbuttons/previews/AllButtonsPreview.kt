package com.theandroiddeveloper.composesigninbuttons.previews

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.theandroiddeveloper.composesigninbuttons.apple.DarkAppleButton
import com.theandroiddeveloper.composesigninbuttons.apple.LightAppleButton
import com.theandroiddeveloper.composesigninbuttons.facebook.DarkFacebookButton
import com.theandroiddeveloper.composesigninbuttons.google.DarkGoogleButton
import com.theandroiddeveloper.composesigninbuttons.google.LightGoogleButton
import com.theandroiddeveloper.composesigninbuttons.twitter.DarkTwitterButton
import com.theandroiddeveloper.composesigninbuttons.twitter.LightTwitterButton

@PhoneDarkAndNightPreview
@Composable
internal fun AllButtonsPreview() {
    PreviewColumn {
        Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
            DarkGoogleButton(label = "Sign in with Google", onClick = { /*TODO*/ })
            LightGoogleButton(label = "Sign in with Google", onClick = { /*TODO*/ })
            DarkTwitterButton(label = "Sign in with Twitter", onClick = { /*TODO*/ })
            LightTwitterButton(label = "Sign in with Twitter", onClick = { /*TODO*/ })
            DarkFacebookButton(label = "Sign in with Facebook", onClick = { /*TODO*/ })
            DarkAppleButton(label = "Sign in with Apple", onClick = { /*TODO*/ })
            LightAppleButton(label = "Sign in with Apple", onClick = { /*TODO*/ })
        }
    }
}