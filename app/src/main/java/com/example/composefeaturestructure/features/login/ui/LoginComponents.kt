package com.example.composefeaturestructure.features.login.ui

import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.text.input.VisualTransformation


import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

/**
 * A reusable text input field for the login screen.
 */
@Composable
fun LoginTextField(
    label: String,
    value: String,
    onValueChange: (String) -> Unit,
    isPassword: Boolean = false
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        visualTransformation = (if (isPassword) PasswordVisualTransformation() else VisualTransformation.None) as PasswordVisualTransformation,
        label = {

        }
    )
}

@Composable
fun TextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: @Composable () -> Unit,
    modifier: Modifier,
    visualTransformation: PasswordVisualTransformation
) {
    TODO("Not yet implemented")
}

/**
 * A reusable button for submitting the login form.
 */
@Composable
fun LoginButton(
    text: String,
    onClick: () -> Unit,
    isEnabled: Boolean = true
) {
    Button(
        onClick = onClick,
        enabled = isEnabled,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Text(text)
    }
}

/**
 * An error message displayed if login fails.
 */
@Composable
fun ErrorMessage(message: String?) {
    if (!message.isNullOrEmpty()) {
        Text(
            text = message,
          //  color = MaterialTheme.colors.error,
          //  style = MaterialTheme.typography.body2,
            modifier = Modifier.padding(vertical = 8.dp)
        )
    }
}