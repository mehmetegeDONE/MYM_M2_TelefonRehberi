package ders1.alistirmalar

fun main() {

    /*
    🏆 Görev 2 – Oyuncu Skor Kartı (Parametreli):
    Kullanıcıdan oyuncu adını ve kazandığı puanı konsoldan isteyin.
    Girilen puanın harf veya boş olması durumunda çökmesini engelleyerek varsayılan bir puan atayın.
    Ardından bu bilgileri parametre olarak alan ve ekrana şık bir skor tablosu yazdıran bir fonksiyon tasarlayın.
     */

    print("Oyuncu adınızı girin: ")
    var oyuncuAdi = readln().trim()
    oyuncuAdi = if (oyuncuAdi.isEmpty()) "oyuncu" else oyuncuAdi

    print("Kazandığınız puanı girin: ")
    var oyuncuPuani = readln().toIntOrNull()?: 0

    skorTablosu(oyuncuAdi,oyuncuPuani)
}

fun skorTablosu(oyuncuAdi: String, oyuncuPuani: Int){
    println("""
        --- SKOR TABLOSU ---
        
        AD: $oyuncuAdi
        PUAN: $oyuncuPuani
    """.trimIndent())
}