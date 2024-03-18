package com.example.appkotlin.myapp

import java.lang.Math.PI
fun buildAquarium() {
    val myAquariumm = Aquarium(width = 25, length = 25, height = 40)
    myAquariumm.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}
fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun main () {
    buildAquarium()
    makeFish()
}


