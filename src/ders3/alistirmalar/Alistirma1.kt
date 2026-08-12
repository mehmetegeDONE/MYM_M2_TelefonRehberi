package ders3.alistirmalar

import ortak.sepeteUrunEkle
import ortak.urunSorgula

/*
Önceki derslerde öğrendiğimiz “Tek Sorumluluk Prensibi (SRP)”ne uygun olarak,
Fonksiyonlar.kt dosyanızda iki farklı fonksiyon oluşturun:

1. sepeteUrunEkle: Parametre olarak esnek bir liste (MutableList<String>) alsın. Kullanıcıdan 3 farklı ürün ismini sırayla isteyip listeye eklesin.
2. urunSorgula: Aynı liste tipini parametre olarak alsın. Kullanıcıdan aramak istediği bir ürün adı isteyin.
Eğer ürün listede varsa kaçıncı sırada olduğunu ekrana yazdırsın. Yoksa kullanıcıyı uyararak ürünü listenin en başına ekleyip sepetin son halini ekrana bassın.

Son olarak main içinden sırasıyla bu iki fonksiyonu çağırarak projenizi test edin.
 */

fun main() {
    val urunListesi = mutableListOf<String>()

    sepeteUrunEkle(urunListesi)
    urunSorgula(urunListesi)
}

