// Bu sınıf; char ve String veri tiplerini, aralarındaki farkları,
// ASCII/Unicode ilişkisini ve temel String metotlarını gösterir.
public class KarakterVeMetinTipleri {

    public static void main(String[] args) {

        // =====================================================================
        // 1. CHAR VERİ TİPİ (İLKEL / PRIMITIVE)
        // =====================================================================
        // Bellekte 2 byte (16 bit) yer kaplar.
        // ASCII yerine UNICODE kullandığı için 2 byte'tır.
        // Varsayılan değeri: '\u0000' (en düşük Unicode karakteri).
        //
        // ZORUNLU KURAL:
        // char tanımlanırken MUTLAKA tek tırnak (') kullanılır.
        // İçine sadece tek bir karakter yazılabilir.
        char harf = 'A';
        char rakamKarakteri = '7';
        char sembol = '#';
        char bosluk = ' ';

        // HATA ÖRNEKLERİ:
        // char hatali1 = "A";   // DERLEME HATASI! Çift tırnak String için kullanılır.
        // char hatali2 = 'Ali'; // DERLEME HATASI! char içine birden fazla harf yazılamaz.

        System.out.println("--- CHAR TANIMLAMALARI ---");
        System.out.println("Harf: " + harf);
        System.out.println("Rakam Karakteri: " + rakamKarakteri);
        System.out.println("Sembol: " + sembol);


        // =====================================================================
        // 2. CHAR VE ASCII / UNICODE İLİŞKİSİ (TİP DÖNÜŞÜMÜ)
        // =====================================================================
        // Her karakterin arka planda sayısal bir tamsayı karşılığı vardır.
        // 'A' karakteri ASCII tablosunda 65 değerine karşılık gelir.

        // A) GENİŞLETME (char -> int):
        // char 2 byte, int 4 byte olduğundan otomatik olarak çevrilir (Widening).
        char kaynakKarakter = 'A';
        int asciiKodu = kaynakKarakter; // Otomatik dönüşüm
        System.out.println("\n--- CHAR -> INT DÖNÜŞÜMÜ ---");
        System.out.println("'A' karakterinin sayısal karşılığı: " + asciiKodu); // 65 basar

        // B) DARALTMA (int -> char):
        // Tam sayıdan karaktere geçerken (char) zorunludur (Narrowing).
        int sayiDegeri = 66;
        char donusturulenKarakter = (char) sayiDegeri; // (char) cast işlemi
        System.out.println("66 sayısının karakter karşılığı: " + donusturulenKarakter); // 'B' basar


        // =====================================================================
        // 3. STRING VERİ TİPİ (REFERANS / NON-PRIMITIVE)
        // =====================================================================
        // String ilkel tip DEĞİLDİR; Java'da tanımlı bir nesne/sınıftır.
        // Değeri doğrudan bellekte tutmaz; bellekteki metin nesnesinin adresini tutar.
        // Çift tırnak (") ile tanımlanır.
        String ad = "Ali";
        String ders = "Java Programlama";

        // Metinleri Birleştirme (Concatenation - '+' Operatörü):
        String selamlama = "Merhaba " + ad + ", " + ders + " dersine hoş geldin!";
        System.out.println("\n--- STRING BİRLEŞTİRME ---");
        System.out.println(selamlama);


        // =====================================================================
        // 4. TEMEL STRING METOTLARI
        // =====================================================================
        String kelime = "Java";

        // length(): Metnin kaç karakterden oluştuğunu (uzunluğunu) int olarak döner.
        int uzunluk = kelime.length();
        System.out.println("\n--- STRING METOTLARI ---");
        System.out.println("'" + kelime + "' kelimesinin uzunluğu: " + uzunluk); // 4

        // toUpperCase(): Metindeki tüm harfleri büyük harfe dönüştürür.
        System.out.println("Büyük harf hali: " + kelime.toUpperCase()); // JAVA

        // substring(baslangic, bitis): Belirtilen indeksler arasındaki metin parçasını alır.
        // 0. indeksten başlar, 2. indekse kadar alır (2 dahil değildir).
        String parca = kelime.substring(0, 2);
        System.out.println("İlk 2 karakter (0'dan 2'ye): " + parca); // Ja


        // =====================================================================
        // 5. EN ÇOK ÇIKAN SINAV TUZAĞI: '==' vs '.equals()'
        // =====================================================================
        // char ilkel (primitive) olduğu için '==' ile kıyaslanır:
        char c1 = 'K';
        char c2 = 'K';
        boolean charEsitMi = (c1 == c2); // true döner

        // String referans (nesne) olduğu için '==' bellek adresini kontrol eder;
        // Metinlerin içeriğini kontrol etmek için MUTLAKA .equals() kullanılmalıdır:
        String metin1 = new String("Deneme");
        String metin2 = new String("Deneme");

        boolean adresEsitMi = (metin1 == metin2);        // FALSE! Bellekteki adresleri farklı
        boolean icerikEsitMi = metin1.equals(metin2);    // TRUE! İçeride yazan metin aynı

        System.out.println("\n--- EŞİTLİK KONTROLÜ FARKI ---");
        System.out.println("char için '==' sonucu: " + charEsitMi);
        System.out.println("String için '==' sonucu (Adres kontrolü): " + adresEsitMi);
        System.out.println("String için .equals() sonucu (İçerik kontrolü): " + icerikEsitMi);

    } // main sonu
} // class sonu
