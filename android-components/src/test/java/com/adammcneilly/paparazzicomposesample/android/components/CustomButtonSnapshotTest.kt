package com.adammcneilly.paparazzicomposesample.android.components

import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.Test

class CustomButtonSnapshotTest {

    @get:Rule
    val paparazzi = Paparazzi()

    @Test
    fun renderButton() {
        paparazzi.snapshot {
            CustomButton(text = "Custom Button")
        }
    }
}