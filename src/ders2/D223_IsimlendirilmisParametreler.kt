package ders2

fun main() {
    profilOlustur("Gürkay","Birinci", bultenAboneligi = true) // Sıra önemi var, önemsiz olması için degisken ismini belirt

    // Diger versiyon - Sıra önemi yok (Otomatik yapmak için metotu yaz ve "specifty all" de veya ampulden yardım al soldaki)
    profilOlustur(
        yas = 48,
        ad = "GÜrkay",
        soyad = "Birinci",
        bultenAboneligi = true
    )
}

fun profilOlustur(ad: String, soyad: String, yas: Int = 18, bultenAboneligi: Boolean = false){
    println("Kullanıcı: $ad $soyad, Yas: $yas, Bülten Aboneligi: $bultenAboneligi")
}