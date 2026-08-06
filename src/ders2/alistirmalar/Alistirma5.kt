package ders2.alistirmalar

import ortak.hipotenusHesapla

fun main() {
    /*
    Görev 5: Dik Üçgen Hipotenüsü (Fonksiyon İçinde Fonksiyon)
    Kullanıcıdan bir dik üçgenin iki dik kenar uzunluğunu (a ve b) tam sayı olarak isteyin ve girdileri çökme korumalı hale getirin.
    Bir sayının karesini alan tek satırlık (Single Expression) bir kareHesapla fonksiyonu yazın.
    Ardından dik kenarları parametre alan bir hipotenusKaresiHesapla fonksiyonu tasarlayın.
    Bu ikinci fonksiyon kenarların karelerini hesaplamak yerine,
    önceden yazdığınız karesini alma fonksiyonunu çağırarak işlemleri yapmalı ve iki karenin toplamını döndürmelidir.
     */

    println("İlk kenarın uzunluğunu girin: ")
    val ilkKenar = readln().toIntOrNull()?: 1
    println("İkinci kenarın uzunluğunu girin: ")
    val ikinciKenar = readln().toIntOrNull()?: 1

    val hipatonusHesapla = hipotenusHesapla(ilkKenar,ikinciKenar)

    println(hipatonusHesapla)
}
