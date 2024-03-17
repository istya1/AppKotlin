package com.example.appkotlin.myapp

fun buildAquariumm() {
    val aquarium6 = Aquariumm(numberOfFish = 29)
    aquarium6.printSize()
    println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000} liters")
}
fun main() {
    buildAquariumm()
}
