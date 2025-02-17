package com.mayokunadeniyi.instantweather.utils

import android.view.View
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import org.hamcrest.Matcher
import org.hamcrest.Matchers

class ActionOnClickableElement(
    private val action: ViewAction
) : ViewAction {

    override fun getDescription(): String = "${action.description} on clickable element"

    override fun getConstraints(): Matcher<View> = Matchers.allOf(
        CanBeClickedMatcher(),
        action.constraints
    )

    override fun perform(uiController: UiController, view: View) {
        action.perform(uiController, view)
    }
}