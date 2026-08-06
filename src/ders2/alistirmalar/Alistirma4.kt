package ders2.alistirmalar

import ortak.sistemUyarisi

fun main() {
    /*
    Görev 4: Esnek Uyarı Sistemi (Default ve Named Args)
    Kullanıcıdan sırasıyla bir uyarı mesajı, bu mesajın bir hata belirtip belirtmediğini (E/H)
    ve isteğe bağlı bir hata kodu (Int) girmesini isteyin. sistemUyarisi adında bir fonksiyon yazın;
    bu fonksiyon mesajı, hata durumunu (varsayılanı false) ve hata kodunu (varsayılanı 404) parametre alsın.
    Eğer girilen hata kodu geçersiz veya boş ise,
    fonksiyon çağrısında bu parametreyi tamamen atlayarak varsayılan değerinin çalışmasını Named Arguments kullanarak sağlayın.
     */

    print("Uyarı mesajını giriniz: ")
    val sistemMesaji = readln().trim()

    print("Hata içeriyor mu (E/H): ")
    val hataIceriyorMu = readln().trim().equals("e",true)

    println("Hata kodu giriniz (opsiyonel, boş bırakmak için enter'a basabilirsiniz) ")
    val hataKodu = readln().toIntOrNull()

    if (hataKodu == null){
        sistemUyarisi(sistemMesaji,hataIceriyorMu)
    } else{
        sistemUyarisi(sistemMesaji,hataIceriyorMu,hataKodu)
    }
}
