package com.firstkmp_project

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "FirstKMPproject",
    ) {
        App()
    }
}