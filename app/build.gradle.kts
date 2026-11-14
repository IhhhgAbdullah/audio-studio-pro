package com.audiostudiopro

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this).apply {
            text = "Audio Studio Pro is Working!"
            textSize = 24f
            setPadding(50, 200, 50, 50)
        }
        setContentView(textView)
    }
}
