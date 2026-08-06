package ders2

fun main() {
    /*
    urunKaydet adında bir fonksiyon oluşturun ve sırasıyla id(Int), kategori(String), isim(String), fiyat(Double) parametrelerini almasını sağlayın.
    kategori parametresine “Genel” varsayılan değerini atayın.
    main içerisinde bu fonksiyonu çağırın. Yukarıda öğrendiğiniz Ctrl + Space kısayolunu kullanarak parametre isimlerini
    IDE’den otomatik tamamlattırın.
    Parametreleri gönderirken sırayı tamamen bozun: Önce fiyat,
    sonra id, en son da ismi Named Argument kullanarak gönderin. Kodun hatasız çalıştığını gözlemleyin.
     */

    urunKaydet(fiyat = 150.0, id = 11, isim = "Defter")
}
fun urunKaydet(id: Int, kategori: String = "Genel", isim: String, fiyat: Double){
    println("Ürün Bilgisi:\nID: $id\nKategori: $kategori\nIsim: $kategori\nFiyat: $fiyat")
}