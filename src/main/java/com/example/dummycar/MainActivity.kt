package com.example.dummycar

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val tv = TextView(this).apply {
            text = "Hello AAOS from naviApp 👋"
            textSize = 22f
            setPadding(32, 32, 32, 32)
        }
        setContentView(tv)
    }
}
