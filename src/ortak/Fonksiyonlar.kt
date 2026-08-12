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

// Alistirma 1

fun sepeteUrunEkle(urunListesi : MutableList<String>){
    for (i in 1..3){
        println("Urun ismi girin: ")
        val urun = readln().trim().lowercase()
        if (urun.isNotEmpty()){
            urunListesi.add(urun)
        }
    }
}

fun urunSorgula(urunlerListesi : MutableList<String>){
    println("Aramak istediginiz ürün adını girin: ")
    val arananUrun = readln().trim().lowercase()
    if (urunlerListesi.contains(arananUrun)){
        val aranananUrununSirasi = urunlerListesi.indexOf(arananUrun)
        println("Mevcut ürünün indexi: $aranananUrununSirasi")
    } else {
        println("Urun sepetinizde bulunamadı!: $arananUrun, listenin başına ekleniyor...")
        urunlerListesi.add(0,arananUrun)
        println("Yeni ürün listesi: $urunlerListesi")
    }
}

// Alistirma 4

fun plakaDogrula(gecerliPlakalar : List<Int>){
    print("Aramak istedigiğiniz plaka kodunu girin: ")
    val arananPlaka = readln().toIntOrNull()

    if (arananPlaka == null){
        println("Geçerli bir kod girin!")
    }
    else {
        if (gecerliPlakalar.contains(arananPlaka)){
            println("Sistemimiz bu şehri desteklemektedir")
        } else {
            println("Desteklenmeyen plaka kodu")
        }
    }
}
