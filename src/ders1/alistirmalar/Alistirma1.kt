package ders1.alistirmalar

fun main() {
    /*
    🖥️ Görev 1 – Kişiselleştirilmiş Sistem Bilgisi (Parametreli):
    Kullanıcıdan konsol üzerinden ismini isteyin (boş bırakma ihtimaline karşı bir varsayılan isim atayın).
    Ardından bu ismi parametre olarak alan ve “Leader Bank” uygulamasının 2026 yılı telif hakkı kartını
    o isme özel olarak konsola basan bir fonksiyon yazın.
     */

    println("Isminizi yazınız: ")
    val girilenIsim = readln().trim()

    val isim = if (girilenIsim.isNotEmpty()) girilenIsim else "Kullanıcı" // Boş ise kullanıcı yazacak.

    sistemBilgisiGoster(isim)
}

fun sistemBilgisiGoster(isim: String){
    println("""
        -UYGULAMA BİLGİLERİ-
        ~Leader Bank Mobile~
        Geliştirici: $isim
    """.trimIndent())
}
