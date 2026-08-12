package ders4

fun main() {

    // mutableMapOf -> sonradan ekleme-çıkarma yapmak istiyorsan
    // MapOf -> sonradan ekleme-çıkarma yapmak istemiyorsan

    // MAPLER
    // 1) Verilerin kendine has şifreleri vardır (Parantezdeki kısım)
    // 2) Şifreler eşsiz olmalıdır
    // 3)

    val sinavNotlari = mutableMapOf<String, Int>()
    sinavNotlari["Matematik"] = 65
    sinavNotlari["Türkçe"] = 70
    sinavNotlari["Fizik"] = 82
    sinavNotlari["Fizik"] = 10 // Fizikin yeni deger atamış olduk

    println(sinavNotlari) // Yazdırma
    println(sinavNotlari["Türkçe"]) // Şifre ile yazdırma
    println(sinavNotlari["Cografya"]) // Olmayan eleman varsa null verir

    println("-------------------------------------------------------")
    for ((key,value) in sinavNotlari){ // Dongu ile yazma
        println("Ders Adi: $key, Notu: $value")
    }

    println("-------------------------------------------------------")
    val sehirPlakalari = mapOf( // Sonradan degistirilmeyecek Map oluşumu
        "Istanbul" to 34,
        "Zonguldak" to 67,
        "Ankara" to 6
    )
}