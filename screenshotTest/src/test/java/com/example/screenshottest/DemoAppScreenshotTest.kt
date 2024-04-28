package com.example.screenshottest

import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import com.example.demoapp.ui.theme.DemoAppTheme
import com.example.demoapp.Greeting
import com.example.demoapp.PreviewGreeting
import org.junit.Rule
import org.junit.Test

class DemoAppScreenshotTest {

    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = DeviceConfig.NEXUS_5
    )

    @Test
    fun testLaunchScreen() {
//        paparazzi.snapshot {
//            DemoAppTheme {
//                Greeting(name = "Android")
//            }
//        }

    }
}