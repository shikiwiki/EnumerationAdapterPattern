package com.example.enumerationadapterpattern

class DogBreeds<String> : Enumeration<String> {

    private val breeds = ArrayList<String>()

    fun addBreed(breed: String) {
        breeds.add(breed)
    }

    override fun hasMoreElements(): Boolean {
        TODO("Not yet implemented")
    }

    override fun nextElement(): String {
        TODO("Not yet implemented")
    }

}