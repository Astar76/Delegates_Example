package com.astar.delegatesexample.delegates.a04_custom_view

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import android.widget.TextView
import com.astar.delegatesexample.R


class CustomView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : FrameLayout(context, attrs) {

    private var titleText: TextView
    private var subtitleText: TextView
    private var descriptionText: TextView

    var title: String
        get() = titleText.text.toString()
        set(value) {
            titleText.text = value
        }

    var subtitle: String
        get() = subtitleText.text.toString()
        set(value) {
            subtitleText.text = value
        }

    var description: String
        get() = descriptionText.text.toString()
        set(value) {
            descriptionText.text = value
        }

    init {
        val view = inflate(context, R.layout.custom_view_item, this)
        titleText = view.findViewById(R.id.titleText)
        subtitleText = view.findViewById(R.id.subtitleText)
        descriptionText = view.findViewById(R.id.descriptionText)

    }
}