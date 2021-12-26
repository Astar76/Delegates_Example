package com.astar.delegatesexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.astar.delegatesexample.delegates.a01_trim.TrimDelegate
import com.astar.delegatesexample.delegates.a04_custom_view.CustomView

class MainActivity : AppCompatActivity() {

    // a001 trimmed delegate
    private val trimDelegate = TrimDelegate()
    private var param: String
        get() = trimDelegate.getValue(this, ::param)
        set(value) {
            trimDelegate.setValue(this, ::param, value)
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val customView: CustomView = findViewById(R.id.custom_view)
        customView.title = "Title text"
        customView.subtitle = "Subtitle text"
        customView.description = "Description text. Hello world."
    }
}