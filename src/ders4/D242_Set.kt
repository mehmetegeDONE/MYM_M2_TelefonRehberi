package ders4

fun main() {

    // mutableSetOf -> sonradan ekleme-çıkarma yapmak istiyorsan
    // SetOf -> sonradan ekleme-çıkarma yapmak istemiyorsan

    // SETLER
    // 1) Aynı veriyi birden fazla bulunduramazsın
    // 2) Indexle tuturmazlar, indexleri alamazsın
    // 3) Hızlı

    val cekilisKatilimcilari = mutableSetOf<String>()
    cekilisKatilimcilari.add("Ahmet")
    cekilisKatilimcilari.add("Ayse")
    cekilisKatilimcilari.add("Ayse") // Tekrar aynı şeyi eklemeye çalışırsan ekleme yapmayacaktır.
    cekilisKatilimcilari.add("Ayse")
    cekilisKatilimcilari.add("Ayse")

    println(cekilisKatilimcilari)

}