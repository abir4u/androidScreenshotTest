package com.example.demoapp

import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import com.example.demoapp.ui.theme.DemoAppTheme
import org.junit.Rule
import org.junit.Test

class ExampleScreenshotTest {

    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = DeviceConfig.NEXUS_5
    )

    @Test
    fun testLaunchScreen() {
        paparazzi.snapshot {
            DemoAppTheme {
                Greeting(name = "Android")
            }
        }
    }
}