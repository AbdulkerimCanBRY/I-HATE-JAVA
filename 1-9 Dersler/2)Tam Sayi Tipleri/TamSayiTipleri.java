// Bu sınıf; short, int ve long veri tiplerini, bellek farklarını ve aralarındaki dönüşümleri gösterir.
public class TamSayiTipleri {

    public static void main(String[] args) {

        // =====================================================================
        // 1. SHORT VERİ TİPİ
        // =====================================================================
        // Bellekte 2 byte (16 bit) yer kaplar.
        // Aralık: -32.768 ile 32.767 arasındadır.
        // Varsayılan değeri: 0
        short kucukTamSayi = 15000;
        short minShort = -32768; // En küçük alabileceği değer
        short maxShort = 32767;  // En büyük alabileceği değer

        // HATA ÖRNEĞİ:
        // short hataliSayi = 50000; // DERLEME HATASI! 32767 sınırını aştığı için sığmaz.

        System.out.println("--- SHORT DEĞERLERİ ---");
        System.out.println("kucukTamSayi: " + kucukTamSayi);
        System.out.println("Short Aralığı: " + minShort + " ile " + maxShort + " arası");


        // =====================================================================
        // 2. INT VERİ TİPİ (VARSAYILAN TAM SAYI TÜRÜ)
        // =====================================================================
        // Bellekte 4 byte (32 bit) yer kaplar.
        // Aralık: Yaklaşık -2.1 milyar ile +2.1 milyar arası (-2^31 ile 2^31 - 1).
        // Varsayılan değeri: 0
        int standartSayi = 190500;
        int minInt = -2147483648;
        int maxInt = 2147483647;

        // HATA ÖRNEĞİ:
        // int buyukNufus = 3000000000; // DERLEME HATASI! 2.1 milyar sınırını aştığı için int içine sığmaz.

        System.out.println("\n--- INT DEĞERLERİ ---");
        System.out.println("standartSayi: " + standartSayi);
        System.out.println("Int Aralığı: " + minInt + " ile " + maxInt + " arası");


        // =====================================================================
        // 3. LONG VERİ TİPİ
        // =====================================================================
        // Bellekte 8 byte (64 bit) yer kaplar.
        // Çok büyük sayılar, sayaçlar ve milisaniye bazlı zaman damgaları için kullanılır.
        // Varsayılan değeri: 0L
        //
        // KRİTİK SINAV KURALI:
        // Java'da yazılan her tam sayı varsayılan olarak 'int' kabul edilir.
        // Sayı 2.1 milyardan büyükse, sonuna mutlaka 'L' veya 'l' eklenmelidir.
        // Eklenmezse derleyici sayıyı int sanıp taşma hatası fırlatır.
        long dunyaNufusu = 85000000000L; // Sona 'L' zorunludur
        long ulkeButcesi = 150000000L;

        System.out.println("\n--- LONG DEĞERLERİ ---");
        System.out.println("dunyaNufusu: " + dunyaNufusu);
        System.out.println("ulkeButcesi: " + ulkeButcesi);


        // =====================================================================
        // 4. BU ÜÇ TİP ARASINDAKİ TİP DÖNÜŞÜMLERİ (TYPE CASTING)
        // =====================================================================

        // A) GENİŞLETME (WIDENING / OTOMATİK DÖNÜŞÜM):
        // Hiyerarşi: short -> int -> long
        // Küçük kutu büyük kutunun içine rahatça sığar, ek işlem gerekmez ve veri kaybı olmaz.
        short parcaSayisi = 250;
        int intParca = parcaSayisi;      // short -> int (Otomatik)
        long longParca = intParca;       // int -> long (Otomatik)

        System.out.println("\n--- OTOMATİK GENİŞLETME (WIDENING) ---");
        System.out.println("short'tan long'a aktarılan değer: " + longParca);

        // B) DARALTMA (NARROWING / MANUEL DÖNÜŞÜM):
        // Hiyerarşi: long -> int -> short
        // Büyük kutuyu küçüğe dökmek risklidir; programcı açıkça (hedefTip) yazmak zorundadır.
        
        // Örnek 1: Sınırlar dahilinde güvenli daraltma
        long guvenliLong = 45000L;
        int daraltilmisInt = (int) guvenliLong; // long -> int açık döküm
        System.out.println("\n--- DARALTMA (NARROWING) ---");
        System.out.println("Güvenli Daraltma (long -> int): " + daraltilmisInt);

        // Örnek 2: Kapasite aşımında veri kaybı ve taşma (Overflow)
        long cokBuyukSayi = 85000000000L; // int sınırının (2.1 milyar) çok üstünde
        int bozulmusSayi = (int) cokBuyukSayi; // Sığmaz! Bit düzeyinde kesilir ve anlamsız bir sayı çıkar
        System.out.println("Veri Kaybı Örneği (Taşma Yaşandı): " + bozulmusSayi);

        // Örnek 3: int'ten short'a daraltma
        int testInt = 50000; // short sınırını (32767) aşıyor
        short bozulmusShort = (short) testInt; // (short) cast zorunludur
        System.out.println("int'ten short'a Taşma Sonucu: " + bozulmusShort);

    }
}
