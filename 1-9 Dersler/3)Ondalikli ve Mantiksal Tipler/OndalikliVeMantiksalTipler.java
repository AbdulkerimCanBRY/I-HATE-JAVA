// Bu sınıf; float, double ve boolean veri tiplerini, aralarındaki farkları ve tip dönüşümlerini içerir.
public class OndalikliVeMantiksalTipler {

    public static void main(String[] args) {

        // =====================================================================
        // 1. FLOAT VERİ TİPİ
        // =====================================================================
        // Bellekte 4 byte (32 bit) yer kaplar.
        // Tek duyarlıklı (single-precision) ondalıklı sayıdır.
        // Varsayılan değeri: 0.0f
        //
        // EN ÇOK ÇIKAN SINAV TUZAĞI:
        // Java'da yazılan her ondalıklı sayı varsayılan olarak 'double' kabul edilir.
        // Bu yüzden float bir değişkene değer atarken sonuna 'f' veya 'F' koymak ZORUNLUDUR!
        float urunFiyati = 25.5f;
        float sicaklik = -14.8F;

        // HATA ÖRNEĞİ:
        // float hataliFiyat = 25.5; // DERLEME HATASI! Java 25.5'i double sayar, float içine sığdıramaz.

        System.out.println("--- FLOAT DEĞERLERİ ---");
        System.out.println("Ürün Fiyatı: " + urunFiyati);
        System.out.println("Sıcaklık: " + sicaklik);


        // =====================================================================
        // 2. DOUBLE VERİ TİPİ (VARSAYILAN ONDALIKLI TÜR)
        // =====================================================================
        // Bellekte 8 byte (64 bit) yer kaplar.
        // Çift duyarlıklı (double-precision) ondalıklı sayıdır.
        // Varsayılan değeri: 0.0d
        // Virgülden sonra yaklaşık 15-17 basamak hassasiyet sunar.
        // Değerin sonuna 'd' veya 'D' koymak isteğe bağlıdır, zorunlu değildir.
        double piSayisi = 3.141592653589793;
        double maas = 45000.75;

        System.out.println("\n--- DOUBLE DEĞERLERİ ---");
        System.out.println("Pi Sayısı: " + piSayisi);
        System.out.println("Maaş: " + maas);


        // =====================================================================
        // 3. BOOLEAN VERİ TİPİ (MANTIKSAL TÜR)
        // =====================================================================
        // Sadece iki değer alabilir: true veya false.
        // Karar yapılarında ve döngü koşullarında kullanılır.
        // Varsayılan değeri: false
        //
        // KRİTİK SINAV TUZAKLARI:
        // 1. boolean degisken = 1;      // HATA! Java'da 1 veya 0 boolean yerine geçmez.
        // 2. boolean aktif = "true";    // HATA! Çift tırnak String demektir, boolean değildir.
        boolean sinaviGectiMi = true;
        boolean kayitTamamlandiMi = false;

        // Karşılaştırma operatörlerinin sonucu da bir boolean üretir:
        boolean buyukMu = (10 > 5); // 10 > 5 doğru olduğu için 'true' üretir.

        System.out.println("\n--- BOOLEAN DEĞERLERİ ---");
        System.out.println("Sınavı Geçti mi: " + sinaviGectiMi);
        System.out.println("Kayıt Tamam mı: " + kayitTamamlandiMi);
        System.out.println("10 > 5 Karşılaştırması: " + buyukMu);


        // =====================================================================
        // 4. ONDALIKLI SAYILAR ARASINDA TİP DÖNÜŞÜMÜ (CASTING)
        // =====================================================================

        // A) GENİŞLETME (float -> double):
        // 4 byte'lık float, 8 byte'lık double içine otomatik sığar (Widening).
        float kucukOndalik = 18.25f;
        double buyukOndalik = kucukOndalik; // Otomatik dönüşüm, veri kaybı olmaz.
        System.out.println("\n--- OTOMATİK GENİŞLETME (float -> double) ---");
        System.out.println("Double'a aktarılan float: " + buyukOndalik);

        // B) DARALTMA (double -> float):
        // 8 byte'lık double, 4 byte'lık float içine doğrudan sığmaz.
        // Programcının açıkça parantez içinde (float) yazması gerekir (Narrowing).
        double hassasSayi = 123.456789;
        float daraltilmisFloat = (float) hassasSayi; // Açık dönüşüm (Explicit Casting)
        System.out.println("\n--- DARALTMA (double -> float) ---");
        System.out.println("Orijinal double: " + hassasSayi);
        System.out.println("Float'a daraltılmış hali (Hassasiyet azalabilir): " + daraltilmisFloat);


        // =====================================================================
        // 5. ONDALIKLIDAN TAM SAYIYA DÖNÜŞÜM (VERİ KAYBI)
        // =====================================================================
        // double veya float bir sayıyı int tipine zorla dönüştürürsen:
        // Ondalık kısım kesinlikle yuvarlanmaz, virgülden sonrası tamamen ATILIR!
        double etiketFiyati = 89.99;
        int tamFiyat = (int) etiketFiyati; // 89.99 değeri doğrudan 89 olur (.99 kısmı çöpe gider)

        System.out.println("\n--- ONDALIKLIDAN TAM SAYIYA DÖNÜŞÜM ---");
        System.out.println("Orijinal Değer: " + etiketFiyati);
        System.out.println("int'e Kesilmiş Değer: " + tamFiyat);

    } // main sonu
} // class sonu
