package com.delalic.androidcommuinity.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.delalic.androidcommuinity.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditTextExample() {
    OutlinedTextField(
        value = "",
        onValueChange = {},
        label = { Text(stringResource(id = R.string.sample)) },
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Blue,
            unfocusedBorderColor = Color.Black
        )
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NotOutlinedEditTextExample() {
    TextField(
        value = "",
        onValueChange = {},
        label = { Text(stringResource(id =
        R.string.sample)) },
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, bottom = 16.dp),
        colors =
        TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Blue,
            unfocusedBorderColor = Color.Black
        )
    )
}


@Composable
fun ButtonWithIcon() {
    Button(onClick = { /*TODO*/ }) {
        Icon(painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = stringResource(id = R.string.shop),
            modifier = Modifier.size(20.dp))
        Text(text = stringResource(id = R.string.shop),
            modifier = Modifier.padding(start = 10.dp))
    }
}

@Composable
fun ElevatedButtonExample() {
    Button(
        onClick = {},
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 8.dp,
            pressedElevation = 10.dp,
            disabledElevation = 0.dp
        )
    ) {
        Text(text = stringResource(id = R.string.elevated))
    }
}

@Composable
fun ImageViewExample() {
    Image(
        painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = stringResource(
            id = R.string.image),
        modifier = Modifier.size(200.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun UIElementsPreview() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()
            .padding(start = 12.dp, end = 12.dp)
    ) {
        EditTextExample()
        NotOutlinedEditTextExample()
        ButtonWithIcon()
        ElevatedButtonExample()
        ImageViewExample()
    }
}