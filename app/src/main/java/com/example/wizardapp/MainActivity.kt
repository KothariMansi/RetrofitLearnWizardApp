package com.example.wizardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.wizardapp.ui.theme.WizardAppTheme
import  androidx.lifecycle.viewmodel.compose.viewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WizardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    WizardData()
                }
            }
        }
    }
}

@Composable
fun WizardData(
    modifier: Modifier = Modifier,
    viewModel: MyViewModel = viewModel()
) {
    val data = viewModel.harryPotterData.observeAsState().value

    if (data != null) {
        Text(
            text = data,
            modifier = modifier.padding(18.dp)
        )
    }

}