package ortak

// Alistirma 1 -

fun sepetHesapla(urunFiyati: Double, kdv: Double = 0.18, kargoUcreti: Double = 29.90 ): Double {
    val totalFiyat = urunFiyati * kdv + urunFiyati
    return totalFiyat + kargoUcreti
}

// Alistirma 3 -

fun daireAlaniHesapla(yaricap: Int) = 3.14 * yaricap * yaricap

// Alistirma 4 -

fun sistemUyarisi(mesaj: String, hataliMi : Boolean = false, hataKodu : Int = 404) {
    var durumMetni = if (hataliMi) "hata" else "bilgi"
    println("Durum metni: $durumMetni\nHata kodu: $hataKodu\nMesajın: $mesaj")
}

// Alistirma 5 -

fun kareHesapla(kare: Int) = kare * kare

fun hipotenusHesapla(ilkKenar : Int, ikinciKenar: Int) : Int{
    val ilkKenarKaresi = kareHesapla(ilkKenar)
    val ikinciKenarKaresi = kareHesapla(ikinciKenar)

    return ilkKenarKaresi + ikinciKenarKaresi
}