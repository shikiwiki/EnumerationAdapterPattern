package com.example.enumerationadapterpattern

interface Iterator<T> {
    fun hasNext(): Boolean
    fun next(): T
    fun remove()
}