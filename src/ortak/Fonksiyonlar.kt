package ortak

import kotlin.collections.component1
import kotlin.collections.component2

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

// PROJE

fun menuGoster(){

val RESET = "\u001b[0m"
val BLACK = "\u001b[30m"
val RED = "\u001b[31m"
val GREEN = "\u001b[32m"
val YELLOW = "\u001b[33m"
val BLUE = "\u001b[34m"
val MAGENTA = "\u001b[35m"
val CYAN = "\u001b[36m"
val WHITE = "\u001b[37m"

println("""
    --- TELEFON REHBERİ --- ${BLUE}
1. Kişi Ekle ${GREEN}
2. Kişi Bul ${CYAN}
3. Tüm Rehberi Listele ${YELLOW}
4. Çıkış ${RESET}
""")
}

fun isimFormatla(isim: String): String {
    return isim.trim().lowercase()
}

fun buyukYazdirma(ad : String) : String{
    return ad.replaceFirstChar{it.uppercase()}
}


fun kisiEkle(rehber: MutableMap<String, String>){
    println("Eklenecek kişinin adı?: ")
    var ad = readln()
    ad = isimFormatla(ad)

    println("Eklenecek kişinin telefon numarası")
    val numara = readln().trim()

    if (ad.isEmpty() || numara.isEmpty()){
        println("Hata: İsim veya telefon numarası boş bırakılamaz!")
    } else if (rehber.contains(ad)){
        println("Bilgi: ${buyukYazdirma(ad)} zaten kayıtlıydı. Numarası güncellendi!")
        rehber[ad] = numara
    } else{
        println("Başarılı: ${buyukYazdirma(ad)} rehbere eklendi!")
        rehber[ad] = numara
    }
}

fun kisiBul(rehber: Map<String, String>){
    print("Kimin numarasını arıyorsunuz?: ")
    var arananAd = readln()
    arananAd = isimFormatla(arananAd)

    if (arananAd.isEmpty() || rehber.containsKey(arananAd)){
        println("Hata: Kişi bulunamadı!")
    } else{
        println("Sonuç: ${buyukYazdirma(arananAd)} -> ${rehber[arananAd]}")
    }
}

fun rehberiListele(rehber: Map<String, String>){
    if (rehber.isEmpty()){
        println("Uyarı: Rehberiniz henüz boş. İlk önce kişi ekleyin!")
    } else{
        println("--- KAYITLI KİŞİLER ---")

        for ((key,value) in rehber){
            println("Ad: ${buyukYazdirma(key)}, Numara: $value")
        }
        println("-----------------------")
    }
}
