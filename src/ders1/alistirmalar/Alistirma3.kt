package ders1.alistirmalar

fun main() {
    /*
    📐 Görev 3 – Dikdörtgen Alan Hesaplayıcı (Güvenli double):
    Kullanıcıdan dikdörtgenin iki kenar uzunluğunu konsoldan isteyin.
    Girdilerin sayısal olmama durumunu kontrol ederek yedek birer kenar değeri atayın.
    Kenarları alan ve alanı hesaplayıp geriye (Double) döndüren bir fonksiyon yazın.
    Sonucu ana programda yazdırın.
    */

    println("Dikdörtgenin iki kenarının uzunluklarını girin: ")
    print("1. kenar: ")
    val kenarBir = readln().toDoubleOrNull()?:1.0
    print("2. kenar: ")
    val kenarIki = readln().toDoubleOrNull()?:1.0

    alanHesaplamaDikdortgen(kenarBir, kenarIki)
}

fun alanHesaplamaDikdortgen(kenarBir : Double, kenarIki : Double){
    val carpim = kenarBir * kenarIki
    println("Dikdörtgenin Alanı: $carpim")

    //val formatliMarsKilosu = "%.3f".format(marsKilosu) // <- Floatun 00000000000'larını azaltmak için
    //"%.3f".format(marsKilosu)
}