package ders1

fun main() {
    /*
    Parametreli Görev: urunFiyatiGoster adında bir fonksiyon oluşturun.
    Dışarıdan urunAdi (String) ve fiyat (Double) olmak üzere iki adet parametre alsın.
    Ekrana “Seçtiğiniz ürün: [urunAdi],Fiyat: [fiyat] TL” yazdırsın. main bloğu içerisinden
    bu fonksiyonu 3 farklı ürün ve fiyat bilgisi göndererek test edin.
     */

    urunFiyatiGoster("Klavye",1200.0)
    cizgiCek()
    urunFiyatiGoster("Defter",50.0)
    cizgiCek()
    urunFiyatiGoster("Silgi",15.0)
}

fun urunFiyatiGoster(urunAdi: String, fiyat: Double){
    println("Seçtiğiniz ürün: $urunAdi, Fiyat: $fiyat TL")
}