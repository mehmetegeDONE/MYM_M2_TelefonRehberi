package ders2

fun main() {
    var sayininKaresi = kareHesapla(5)
    println(sayininKaresi)
    sayininKaresi = kareHesaplaKisa(2)
    println(sayininKaresi)
}

fun kareHesapla(sayi: Int): Int { // Normal return şekli
    return sayi * sayi
}

fun kareHesaplaKisa(sayi: Int) = sayi * sayi // Tek satirlik returnsuz + degiskeni belirtmeden return şekli