package ders2.alistirmalar

import ortak.daireAlaniHesapla

fun main() {
    /*
    Görev 3: Tek Satırlık Matematik (Single Expression)
    Kullanıcıdan bir yarıçap (Int) değeri isteyin ve girdiyi çökme korumalı hale getirin.
    Dairenin alanını (3.14 * r * r) hesaplayıp geriye ondalıklı (Double) olarak döndüren bir fonksiyon yazın.
    Bu fonksiyonu süslü parantez veya return anahtar kelimesi kullanmadan, tamamen tek satırda (Single Expression) tasarlayın.
     */

    print("Yarıcap girin: ")
    val yaricap = readln().toIntOrNull()?: 0

    println(daireAlaniHesapla(yaricap))


}