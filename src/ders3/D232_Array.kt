package ders3

import java.util.Arrays

fun main() {
    // ICI DOLU ARRAY

    val gunler = arrayOf("Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar") // String bir array oldugunu otomatik algılıyor.

    println(gunler[2]) // Çarşamba yazar
    println(gunler[2].uppercase()) // ÇARŞAMBA yazar
    val carsamba = gunler[2]

    gunler[6] = "PAZAR" // 6. index (Pazar)'ı degiştirdi.
    println(gunler[6])

    //println(gunler[7]) // HATA: ARRAY INDEX OUT OF BOUNDS

    // ICI BOS ARRAY

    val isimler = arrayOfNulls<String>(4) // 4 tane null index oluşturduk.
    val sayilar = IntArray(3) // 3 tane boş int (0) index oluşturduk
    val ondalikli = DoubleArray(2) // 2 tane boş (0.0) double index oluşturduk

    isimler[0] = "Ali" //İlk indexe "Ali" degerini verir.

    // YAZDIRMA

    println(isimler) // Saçma sapan adres şeyleri yazdırır.
    println(isimler.contentToString()) // Yan yana array yapısı şeklinde yazdırma
    println(isimler.joinToString("-")) // Yan yana yazdırır ama ayara seperator içine girileni koyar

    for (gun in gunler){
        println(gun.uppercase()) // Tum indexleri büyük yazar
    }
}