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

    private val view = inflate(context, R.layout.custom_view_item, this)

    private var titleText: TextView = view.findViewById(R.id.titleText)
    private var subtitleText: TextView = view.findViewById(R.id.subtitleText)
    private var descriptionText: TextView = view.findViewById(R.id.descriptionText)

    var title by titleText.text()
    var subtitle by subtitleText.text()
    var description by descriptionText.text()
}