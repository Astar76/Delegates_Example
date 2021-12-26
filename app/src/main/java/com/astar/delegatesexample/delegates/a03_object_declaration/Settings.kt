package com.astar.delegatesexample.delegates.a03_object_declaration

import android.content.Context
import android.content.SharedPreferences

class Settings(context: Context) {

    private val prefs: SharedPreferences = context.getSharedPreferences(NAME_STORAGE, Context.MODE_PRIVATE)

    var param1 by prefs.stringNullable()
    var param2 by prefs.int()
    var param3 by prefs.string(
        key = { "KEY_PARAM_3" },
        defaultValue = "default"
    )

    companion object {
        const val NAME_STORAGE = "settings"
    }
}