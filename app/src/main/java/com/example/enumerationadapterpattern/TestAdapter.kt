package com.example.enumerationadapterpattern

fun main() {
    val dogBreeds = DogBreeds<String>()
    
    dogBreeds.addBreed("frenchie")
    dogBreeds.addBreed("pug")
    dogBreeds.addBreed("pit bull")

    val dogBreedsAdapter = EnumerationIterator(dogBreeds)

    val val1 = dogBreedsAdapter.hasNext()
    val val2 = dogBreedsAdapter.next()
    val val3 = dogBreedsAdapter.remove()
}


