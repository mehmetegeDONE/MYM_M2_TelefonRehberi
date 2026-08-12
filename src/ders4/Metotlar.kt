package ders4

/*

SET METOTLARİ ----------------------------------------------------------------------------------------------------------

.add(eleman)	            Kümeye yeni eleman ekler. Eleman zaten varsa hiçbir işlem yapmaz ve hata vermez. (Sadece mutableSet)	kume.add(“Ahmet”)
.remove(eleman)	            Belirtilen elemanı kümeden siler. Index numarası verilmez! (Sadece mutableSet)	kume.remove(“Ayşe”)
.contains(eleman)	        Elemanın kümede olup olmadığını kontrol eder (true/false döner). Set yapısının en güçlü metodudur.	if (kume.contains(“Ali”))


MAP METOTLARİ   ---------------------------------------------------------------------------------------------------------

map[anahtar] = değer	    Map’e yeni bir kayıt ekler. Anahtar daha önce varsa eski değerin üzerine yazar (günceller). (Sadece mutableMap)	sozluk[“Elma”] = 50
map[anahtar]	            Anahtarı vererek değeri okumanızı sağlar. Anahtar yoksa geriye null döner!	val fiyat = sozluk[“Elma”]
.remove(anahtar)	        Sadece anahtarı vererek o kaydı (hem anahtarı hem de değerini) sistemden tamamen siler.	sozluk.remove(“Elma”)

.containsKey(anahtar)	    Aradığınız anahtarın Map içinde olup olmadığını kontrol eder (true/false). Çok hızlı çalışır.	if (sozluk.containsKey(“Elma”))
.containsValue(değer)	    Aradığınız değerin Map içinde herhangi bir anahtara atanıp atanmadığını arar (true/false).	if (sozluk.containsValue(50))
.keys	                    Map içindeki sadece Anahtarları alıp size bir Set (Küme) olarak verir.	val anahtarlar = sozluk.keys
.values	                    Map içindeki sadece Değerleri alıp size bir Collection olarak verir.	val degerler = sozluk.values

MAPTE FOR DONGUSU ---------------------------------------------------------------------------------------------------------

Bir Map’in içindeki tüm kayıtları sırayla okumak (ekrana yazdırmak vb.) isterseniz,
for döngüsünü çok zarif bir şekilde kullanabilirsiniz. Kotlin, her adımda anahtarı ve değeri size iki ayrı değişken olarak teslim eder:

for ((anahtar, deger) in sozluk) {
    println("Ürün: $anahtar -> Fiyat: $deger TL")
}

 */