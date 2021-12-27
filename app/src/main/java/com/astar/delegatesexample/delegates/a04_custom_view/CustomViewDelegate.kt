package com.astar.delegatesexample.delegates.a04_custom_view

import android.widget.TextView
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun TextView.text(): ReadWriteProperty<Any, String> =
    object : ReadWriteProperty<Any, String> {
        override fun getValue(thisRef: Any, property: KProperty<*>) =
            text.toString()

        override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
            text = value
        }
    }