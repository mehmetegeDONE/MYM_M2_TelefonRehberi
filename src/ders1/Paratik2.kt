package ders1

fun main() {
    /*
    Problem 2: Mesafe Dönüştürücü (Double):
     Bir harita uygulaması için kilometre değerini mil ölçüsüne çeviren bir fonksiyon tasarlayacaksınız.
      Fonksiyon dışarıdan kilometre değerini (Double) alsın, geriye
      ise bu mesafenin mil karşılığını (Double) döndürsün (1 km yaklaşık 0.62 mildir).
      Dönen mil sonucunu main içerisinde yakalayıp ekrana yazdırın.
     */

    print("Kilometre degerinizi girin: ")
    val kilometre = readln().toDoubleOrNull()

    val mil = milCevirici(kilometre?: 0.0)
    println("$kilometre km = $mil mil")
}

fun milCevirici(kilometre: Double): Double{
    return kilometre * 0.62
}