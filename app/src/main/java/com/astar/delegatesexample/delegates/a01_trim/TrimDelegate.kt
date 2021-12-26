package com.astar.delegatesexample.delegates.a01_trim

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class TrimDelegate : ReadWriteProperty<Any?, String> {

    private var trimmedValue = ""

    override fun getValue(thisRef: Any?, property: KProperty<*>) = trimmedValue

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        trimmedValue = value.trim()
    }
}