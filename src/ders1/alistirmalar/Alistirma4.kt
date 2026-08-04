package ders1.alistirmalar

fun main() {
    /*
    🔢 Görev 4 – Tek mi, Çift mi? (Koşullu Kontrol):
    Kullanıcıdan bir tam sayı isteyin (çökme koruması uygulayın).
    Sayıyı alıp çift ise geriye true, tek ise false döndüren bir fonksiyon yazın.
    Fonksiyondan dönen bu Boolean değeri ana programda bir if koşulu içerisinde sınayarak ekrana özel durum mesajı bastırın.
    */

    print("Bir sayı girin: ")
    val sayi = readln().toIntOrNull()?: 0

    val sonuc = ciftMi(sayi)

    if (sonuc){
        println("Girilen $sayi sayisi çift")
    } else{
        println("Girilen $sayi sayisi tek")
    }
}

fun ciftMi(sayi: Int): Boolean {
    return sayi % 2 == 0
}