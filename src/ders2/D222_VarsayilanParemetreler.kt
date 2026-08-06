package ders2

import ders1.cizgiCek

fun main() {
    kahvaSiparisiAl("Filte Kahve")
    cizgiCek()
    kahvaSiparisiAl("Türk Kahvesi","Sekersiz")
    cizgiCek()
    kahvaSiparisiAl("Latte", sutlu = true) // Parametre sıralasını atlama
}

fun kahvaSiparisiAl(kahveTuru: String, sekerMikrati: String = "Orta", sutlu: Boolean = false){ // = ile varsayılan deger koyabilirsin
    println("Sipariş: $kahveTuru, Şeker miktarı: $sekerMikrati, Sultu mü: ${if (sutlu) "Sütlü" else "Süzsüz"}")
}