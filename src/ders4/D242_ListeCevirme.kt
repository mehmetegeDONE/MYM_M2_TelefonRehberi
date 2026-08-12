package ders4

fun main() {

    val cekilisKatilimcilari = mutableSetOf<String>()
    cekilisKatilimcilari.add("Ahmet")
    cekilisKatilimcilari.add("Ayse")
    cekilisKatilimcilari.add("Ayse") // Tekrar aynı şeyi eklemeye çalışırsan ekleme yapmayacaktır.
    cekilisKatilimcilari.add("Ayse")
    cekilisKatilimcilari.add("Ayse")

    println(cekilisKatilimcilari)

    val katilimciSayisi = cekilisKatilimcilari.toList() // toList ile Liste çevirdik
    println("İstenen index: " + katilimciSayisi[0])

    val tekrarliElemanlariSil = katilimciSayisi.toSet() // toSet ile Sete çevirdik
}