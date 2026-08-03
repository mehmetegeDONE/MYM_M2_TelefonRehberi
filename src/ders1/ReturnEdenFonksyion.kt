package ders1

import java.time.LocalTime

fun main(){

    print("Dogum yılını gir: ")
    val dogumYili = readln().toInt()

    val yas = yasHesapla(dogumYili)
    println("Yaşınız " + yas)

    if (yas >= 18){
        println("Ehliyet alabilirsin")
    } else{
        println("Ehliyet alamazsın!")
    }
}

fun yasHesapla(dogumYili: Int) : Int{ // Return type'da metot sonuna ":" koyup döndüreceği degisken türünü yazıyoruz.
    return 2026 - dogumYili
}