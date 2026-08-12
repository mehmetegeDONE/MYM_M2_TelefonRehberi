package ders3.alistirmalar

fun main() {
    /*
    Kullanıcıdan konsol üzerinden sırayla 5 adet tam sayı isteyin. Girdilerin sayısal olmama durumunu kontrol ederek çökme koruması uygulayın
    ve bu sayıları sabit boyutlu boş bir tam sayı dizisine (Array) yerleştirin. Ardından bu diziyi küçükten büyüğe otomatik olarak sıralayarak ekrana yazdırın.
    Sonucu yazdırırken döngü kullanmadan, tek bir satırda yazdırın.
    */

    val sayilar = IntArray(5)

    for (i in  0 until sayilar.size){
        print("${i+1}. Sayıyı girin: ")
        val sayim = readln().toIntOrNull()?:0
        sayilar[i] = sayim
    }

    sayilar.sort() // kucukten büyüge
    println(sayilar.contentToString())

}