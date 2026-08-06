package ders2.alistirmalar

import ortak.sepetHesapla

fun main() {
    /*
    Kullanıcıdan satın aldığı ürünün fiyatını konsol üzerinden ondalıklı sayı olarak isteyin.
    Girdinin geçersiz olması durumunda çökme koruması uygulayarak varsayılan bir ürün fiyatı belirleyin.
    Ardından sepetHesapla adında bir fonksiyon yazın.
    Bu fonksiyon ürün fiyatını, KDV oranını (varsayılan değeri 0.18) ve kargo ücretini (varsayılan değeri 29.90) parametre olarak alsın.
    Fonksiyon, ürünün KDV eklenmiş fiyatına kargo ücretini de yansıtarak toplam ödenecek tutarı hesaplayıp geriye döndürsün.
     */

    print("Ürünün fiyatını giriniz: ")
    val fiyat = readln().toDoubleOrNull()?: 0.0

    println(sepetHesapla(fiyat))
}