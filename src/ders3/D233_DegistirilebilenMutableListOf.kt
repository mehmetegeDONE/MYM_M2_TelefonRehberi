package ders3

import java.util.Collections


fun main() {
    val alisVerisSepeti = mutableListOf<String>()

    alisVerisSepeti.add("kalem") // sondan ekleme
    alisVerisSepeti.add("defter")

    alisVerisSepeti.add(1, "çanta") // yazılan indexin arkasına ekleme

    alisVerisSepeti.remove("Defter") // Defter verisine sahip (sadece bir indexdeki veriyi) siler
    alisVerisSepeti.removeAt(1)        // 1. indexdeki veriyi siler

    println(alisVerisSepeti)

    // val degistirlemezdi neden indexler degisebiliyor?

    var isimler = mutableListOf("Ahmet","Veli")

    isimler = mutableListOf("A","B") // val yaparsan eğer yeni liste atayamazsın, indexler atama sayılmaz!


}