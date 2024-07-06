package com.example.siliconandroidbatch2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.siliconandroidbatch2.ui.theme.SiliconAndroidBatch2Theme
import androidx.compose.material3.Text as Text1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SiliconAndroidBatch2Theme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    Greeting(name = "Android")
                    Spacer(modifier = Modifier.height(16.dp))
                    FilledTonalButtonExample(onClick = { /* Handle click */ })
                    Spacer(modifier = Modifier.height(16.dp))
                    HorizontalDividerExample()

                    FilledButtonExample(onClick = { /* Handle click */ })
                    Spacer(modifier = Modifier.height(16.dp))
                    HorizontalDividerExample()

                    OutlinedButtonExample(onClick = { /* Handle click */ })
                    Spacer(modifier = Modifier.height(16.dp))
                    HorizontalDividerExample()

                    ElevatedButtonExample(onClick = { /* Handle click */ })
                    Spacer(modifier = Modifier.height(16.dp))
                    HorizontalDividerExample()

                    TextButtonExample(onClick = { /* Handle click */ })
                    Spacer(modifier = Modifier.height(16.dp))
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        FilledCardExample()
                        HorizontalDividerExample()
                        FilterChipExample()
                        HorizontalDividerExample()
                        SliderMinimalExample()
                        HorizontalDividerExample()
                        SwitchMinimalExample()
                        HorizontalDividerExample()
                        Spacer(modifier = Modifier.height(16.dp))
                        HorizontalDividerExample()
                        HorizontalDividerExample()
                        Spacer(modifier = Modifier.height(16.dp))
                        IndeterminateCircularIndicator()
                    }
                }
            }
        }
    }

    @Composable
    fun FilledTonalButtonExample(onClick: () -> Unit) {
        FilledTonalButton(onClick = { onClick() }) {
            Text1("Tonal")
        }
    }

    @Composable
    fun FilledButtonExample(onClick: () -> Unit) {
        Button(onClick = { onClick() }) {
            Text1("Filled")
        }
    }

    @Composable
    fun OutlinedButtonExample(onClick: () -> Unit) {
        OutlinedButton(onClick = { onClick() }) {
            Text1("Outlined")
        }
    }

    @Composable
    fun ElevatedButtonExample(onClick: () -> Unit) {
        ElevatedButton(onClick = { onClick() }) {
            Text1("Elevated")
        }
    }

    @Composable
    fun TextButtonExample(onClick: () -> Unit) {
        TextButton(onClick = { onClick() }) {
            Text1("Text Button")
        }
    }

    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text1(
            text = "Hello $name!",
            modifier = modifier
        )
    }

    @Composable
    fun FilledCardExample() {
        Card(
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant,
            ),
            modifier = Modifier
                .size(width = 240.dp, height = 100.dp)
        ) {
            Text1(
                text = "This is a card",
                modifier = Modifier.padding(16.dp),
                textAlign = TextAlign.Center
            )
        }
    }

    @Composable
    fun FilterChipExample() {
        var selected by remember { mutableStateOf(false) }

        FilterChip(
            onClick = { selected = !selected },
            label = {
                Text1("Filter chip")
            },
            selected = selected,
            leadingIcon = if (selected) {
                {
                    Icon(
                        imageVector = Icons.Filled.Done,
                        contentDescription = "Done icon",
                        modifier = Modifier.size(FilterChipDefaults.IconSize)
                    )
                }
            } else {
                null
            },
        )
    }

    @Composable
    fun SliderMinimalExample() {
        var sliderPosition by remember { mutableFloatStateOf(0f) }
        Column {
            Slider(
                value = sliderPosition,
                onValueChange = { sliderPosition = it }
            )
            Text1(text = sliderPosition.toString())
        }
    }

    @Composable
    fun SwitchMinimalExample() {
        var checked by remember { mutableStateOf(true) }

        Switch(
            checked = checked,
            onCheckedChange = {
                checked = it
            }
        )
    }

    @Composable
    fun HorizontalDividerExample() {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Text1("First item in list")
            Divider(thickness = 2.dp)
            Text1("Second item in list")
        }
    }

    @Composable
    fun IndeterminateCircularIndicator() {
        var loading by remember { mutableStateOf(false) }

        Button(onClick = { loading = true }, enabled = !loading) {
            Text1("Start loading")
        }

        if (!loading) return

        CircularProgressIndicator(
            modifier = Modifier.width(64.dp),
            color = MaterialTheme.colorScheme.secondary,
            trackColor = MaterialTheme.colorScheme.surfaceVariant,
        )
    }
}
