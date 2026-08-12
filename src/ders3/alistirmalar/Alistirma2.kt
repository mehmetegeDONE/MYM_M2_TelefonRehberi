package ders3.alistirmalar

fun main() {
    /*
    Bir çekiliş uygulaması tasarlıyorsunuz. Kullanıcıdan konsol üzerinden sırayla
    4 farklı katılımcı ismi girmesini isteyin. Katılımcıların tamamı listeye eklendiğinde;
    önce listenin sırasını rastgele karıştırın, ardından bu listeden rastgele bir şanslı kazanan seçip
    ekrana yazdırın.
    Toplam katılımcı sayısını da ekranda gösterin.
     */

    val katilimcilar = arrayOfNulls<String>(4)

    for (i in 0..3){
        println("$i. katılımcının ismini girin:")
        val katilimci = readln().trim()
        if (katilimcilar.isNotEmpty()) katilimcilar[i] = katilimci
    }

    println("Listem: ${katilimcilar.contentToString()}")

    val kazananKatilimci = katilimcilar.random()

    println("Toplam katılımcı sayısı: ${katilimcilar.size}" )
    println("Kazanan katılımcı: $kazananKatilimci")
}