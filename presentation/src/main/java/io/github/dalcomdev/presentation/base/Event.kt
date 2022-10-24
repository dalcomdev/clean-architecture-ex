package io.github.dalcomdev.presentation.base

import kotlinx.coroutines.handleCoroutineException

class Event<T>(private val content: T) {
    var handled = false
        private set

    fun getContentIfNotHandled(): T? {
        return if (handled) {
            null
        } else {
            handled = true
            content
        }
    }
}