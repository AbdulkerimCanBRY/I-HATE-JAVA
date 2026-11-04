// Bu sınıf; metot aşırı yükleme (overloading) kurallarını, parametre sayısı/tipi/sırası farklarını
// ve sınavlarda en çok puan kırılan dönüş tipi (return type) tuzağını içerir.

public class MetotAsiriYukleme {

    // =========================================================================
    // 1. TEMEL METOT: 2 ADET INT TOPLAYAN METOT
    // =========================================================================
    // Metot İmzası: topla(int, int)
    public static int topla(int a, int b) {
        System.out.println("-> topla(int, int) çalıştı.");
        return a + b;
    }


    // =========================================================================
    // 2. FARK 1: PARAMETRE SAYISININ FARKLI OLMASI
    // =========================================================================
    // Metot ismi yine 'topla' ama parametre sayısı 3 adettir.
    // Metot İmzası: topla(int, int, int)
    public static int topla(int a, int b, int c) {
        System.out.println("-> topla(int, int, int) çalıştı.");
        return a + b + c;
    }


    // =========================================================================
    // 3. FARK 2: PARAMETRE VERİ TİPLERİNİN FARKLI OLMASI
    // =========================================================================
    // Parametre sayısı yine 2 adettir; ancak int yerine double kabul eder.
    // Metot İmzası: topla(double, double)
    public static double topla(double a, double b) {
        System.out.println("-> topla(double, double) çalıştı.");
        return a + b;
    }


    // =========================================================================
    // 4. FARK 3: PARAMETRE SIRALAMASININ FARKLI OLMASI
    // =========================================================================
    // Aynı türde parametreler alsalar bile sıraları farklı olduğu için aşırı yüklenir.

    // Durum A: Önce String, sonra int
    // Metot İmzası: ogrenciBilgisi(String, int)
    public static void ogrenciBilgisi(String isim, int numara) {
        System.out.println("Öğrenci: " + isim + " | Numara: " + numara);
    }

    // Durum B: Önce int, sonra String
    // Metot İmzası: ogrenciBilgisi(int, String)
    public static void ogrenciBilgisi(int numara, String isim) {
        System.out.println("Numara: " + numara + " | Öğrenci: " + isim);
    }


    // =========================================================================
    // 5. EN BÜYÜK SINAV TUZAĞI: SADECE DÖNÜŞ TİPİNİ DEĞİŞTİRMEK HATA VERİR!
    // =========================================================================
    // Aşağıdaki metot derleme hatası üretir! (Yoruma alındı)
    // Sebebi: İlk yazdığımız 'topla(int a, int b)' ile parametreleri tamamen aynıdır.
    // Metot imzalarında dönüş tipi (double veya int) hesaba katılmaz!
    /*
    public static double topla(int a, int b) {
        return (double) (a + b); // DERLEME HATASI: 'method topla(int,int) is already defined'
    }
    */


    // =========================================================================
    // 6. SLAYTTAKİ UYGULAMA SORUSU: getSum VE isEven METOTLARI
    // =========================================================================
    // Soru: Argüman olarak iki tamsayı kabul eden ve toplamını döndüren getSum metodu:
    public static int getSum(int s1, int s2) {
        return s1 + s2;
    }

    // Soru: Bir sayının çift olup olmadığını boolean döndüren isEven metodu:
    public static boolean isEven(int sayi) {
        return (sayi % 2 == 0); // Kalan 0 ise true, değilse false döner
    }

    // isEven metoduna Overload yapalım: Bilgilendirme mesajı da yazsın
    public static boolean isEven(int sayi, boolean bilgiVerilsinMi) {
        boolean sonuc = (sayi % 2 == 0);
        if (bilgiVerilsinMi) {
            System.out.println("Sayı: " + sayi + " | Çift mi: " + sonuc);
        }
        return sonuc;
    }



    // =========================================================================
    // MAIN METODU: ÇAĞRILAR VE OTOMATİK SEÇİM TESTİ
    // =========================================================================
    public static void main(String[] args) {

        System.out.println("=== 1. PARAMETRE SAYISINA GÖRE SEÇİM ===");
        // Java 2 adet int görünce topla(int, int) metoduna gider:
        int sonuc1 = topla(10, 20);
        System.out.println("Sonuç: " + sonuc1 + "\n");

        // Java 3 adet int görünce topla(int, int, int) metoduna gider:
        int sonuc2 = topla(5, 15, 25);
        System.out.println("Sonuç: " + sonuc2 + "\n");


        System.out.println("=== 2. VERİ TİPİNE GÖRE SEÇİM ===");
        // Gönderilen değerler ondalıklı (double) olduğu için topla(double, double) çalışır:
        double sonuc3 = topla(4.5, 3.2);
        System.out.println("Sonuç: " + sonuc3 + "\n");


        System.out.println("=== 3. SIRALAMAYA GÖRE SEÇİM ===");
        // Sıra: String, int -> ogrenciBilgisi(String, int) çalışır:
        ogrenciBilgisi("Can", 101);

        // Sıra: int, String -> ogrenciBilgisi(int, String) çalışır:
        ogrenciBilgisi(202, "Kerim");


        System.out.println("\n=== 4. SLAYT UYGULAMA TESTLERİ ===");
        int toplam = getSum(40, 50);
        System.out.println("getSum(40, 50) sonucu: " + toplam);

        // Tek parametreli isEven:
        System.out.println("isEven(14) sonucu: " + isEven(14)); // true
        System.out.println("isEven(9) sonucu : " + isEven(9));  // false

        // Aşırı yüklenmiş iki parametreli isEven:
        isEven(28, true);

    } // main sonu
} // class sonu
