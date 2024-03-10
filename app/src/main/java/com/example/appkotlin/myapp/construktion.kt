package com.example.appkotlin.myapp

fun buildAquariumm() {
    val aquarium1 = Aquariumm()
    aquarium1.printSize()
    // default height and length
    val aquarium2 = Aquariumm(width = 25)
    aquarium2.printSize()
    // default width
    val aquarium3 = Aquariumm(height = 35, length = 110)
    aquarium3.printSize()
    // everything custom
    val aquarium4 = Aquariumm(width = 25, height = 35, length = 110)
    aquarium4.printSize()
    val aquarium6 = Aquariumm(numberOfFish = 29)
    aquarium6.printSize()
    aquarium6.volume = 70
    aquarium6.printSize()
}
fun main() {
    buildAquariumm()
}