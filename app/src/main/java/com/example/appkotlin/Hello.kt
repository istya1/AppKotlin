package com.example.appkotlin

class Person(
    val nama: String,
    val tempatTanggalLahir: String,
    val hobby: String,
    val deskripsiHobby: String,
    val alamat: String
) {
    fun displayInfo() {
        println("\t\t ================================= \t\t")
        println("\t\t        BIODATA PRIBADI            \t\t")
        println("\t\t ================================= \t\t")
        println("Nama                 : $nama")
        println("Tempat Tanggal Lahir : $tempatTanggalLahir")
        println("Alamat               : $alamat")
        println("Hobby                : $hobby")
        println("Deskripsi Hobby      : $deskripsiHobby")
        println("\t\t ================================= \t\t")
        println("\t\t        NICE TO KNOW YOU           \t\t")
        println("\t\t ================================= \t\t")
    }
}

fun main() {
    // Membuat objek Person
    val person = Person(
        nama               = "Istya Yulia",
        tempatTanggalLahir = "Madiun, 10 Juli 2004",
        hobby              = "Memasak",
        deskripsiHobby     = "Saya suka memasak masakan viral tiktok",
        alamat             = "Jl. Untung Surapati 2 Ds. Kertobanyon, Kec. Geger, Kab.Madiun"
    )

    // Menampilkan informasi tentang orang tersebut
    person.displayInfo()
}
