package com.example.enumerationadapterpattern

class EnumerationIterator(private val enumeration: Enumeration<String>) : Iterator<Any> {
    override fun hasNext(): Boolean {
        return enumeration.hasMoreElements()
    }

    override fun next(): Any {
        return enumeration.nextElement()
    }

    override fun remove() {
        throw UnsupportedOperationException()
    }
}