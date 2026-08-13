package ders5

import ortak.kisiBul
import ortak.kisiEkle
import ortak.menuGoster
import ortak.rehberiListele

fun main() {

    val rehber = mutableMapOf<String, String>()

    do {
        menuGoster()

        print("Seçimininizi girin: ")
        val secim = readln()

        when(secim){
            "1" -> kisiEkle(rehber)
            "2" -> kisiBul(rehber)
            "3" -> rehberiListele(rehber)
            "4" -> break
            else -> println("Hata: Geçersiz işlem! Lütfen 1 ile 4 arasında bir tuşlama yapın.")
        }

    } while (true)

    println("Görüşürüz")
}