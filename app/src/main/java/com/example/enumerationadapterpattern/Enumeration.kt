package com.example.enumerationadapterpattern

interface Enumeration<T> {
    fun hasMoreElements(): Boolean
    fun nextElement(): T
}