package ders3

/*
.add(eleman)	            Listenin en sonuna yeni bir eleman ekler.	liste.add(“Elma”)
.add(index, eleman)     	Belirtilen sıraya (indekse) elemanı zorla sıkıştırır. Diğer elemanlar sağa kayar.	liste.add(0, “Süt”)
.remove(eleman)	            İsmi/değeri verilen elemanı listeden bulup siler.	liste.remove(“Elma”)
.removeAt(index)	        Sıra (indeks) numarasını vererek o sıradaki elemanı acımadan siler.	liste.removeAt(2)
.clear()	                Listeyi tamamen boşaltır, içindeki her şeyi siler.	liste.clear()

2. Bilgi Alma ve Arama (Tüm listelerde geçerlidir)

.size	                    Listenin içinde anlık olarak kaç adet eleman olduğunu (boyutunu) Int olarak verir.	val adet = liste.size
.contains(eleman)	        Aranan eleman listenin içinde var mı diye bakar. Varsa true, yoksa false döner.	if (liste.contains(“Süt”))
.indexOf(eleman)	        Aranan elemanın listede kaçıncı sırada (indekste) olduğunu bulur. Bulamazsa -1 döner.	val sira = liste.indexOf(“Süt”)
.isEmpty()	                Listenin içi tamamen boş mu diye kontrol eder (true/false).	if (liste.isEmpty())

3. Hızlı Düzenleme Metotları

.sort()	                    Listeyi küçükten büyüğe (veya A’dan Z’ye) otomatik olarak alfabetik sıralar. (Sadece mutable listelerde iç yapıyı değiştirir).	liste.sort()
.reverse()	                Listenin mevcut sırasını tamamen tersine çevirir (Sondakini başa, baştakini sona alır).	liste.reverse()
.shuffle()	                Listenin içindeki elemanların sırasını rastgele (random) bir şekilde karıştırır (Kart karıştırmak gibi).	liste.shuffle()
.random()	                Listenin içinden rastgele bir elemanı seçip size teslim eder. Çekiliş yapmak için birebirdir! (Tüm listelerde geçerlidir).	val sansliKisi = liste.random()
 */