package com.example.demoapp

import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import com.example.demoapp.ui.theme.DemoAppTheme
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = DeviceConfig.PIXEL_3A
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