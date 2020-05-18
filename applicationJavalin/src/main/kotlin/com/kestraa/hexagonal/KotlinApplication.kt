package com.kestraa.hexagonal

import com.kestraa.hexagonal.httpServer.StartHttp

fun main() {
    val startHttp = StartHttp()

    startHttp.start()
}