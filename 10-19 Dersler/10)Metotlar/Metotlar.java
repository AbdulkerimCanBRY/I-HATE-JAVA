// Bu sınıf; Java'da metot tanımlama anatomisini, parametre-argüman ayrımını,
// void ve return farkını, iç içe metot çağrımlarını ve static/instance ayrımını içerir.

public class Metotlar {

    // =========================================================================
    // 1. PARAMETRESİZ VE GERİ DEĞER DÖNDÜRMEYEN (VOID) METOT
    // =========================================================================
    // public: Her yerden erişilebilir.
    // static: Nesne oluşturmadan doğrudan çağrılabilir.
    // void: İşlem bittiğinde geriye hiçbir veri/sonuç döndürmez.
    // () içi boş: Dışarıdan hiçbir parametre almaz.
    public static void ekranaSelamVer() {
        System.out.println("Merhaba! Metot başarıyla çalıştı.");
    }


    // =========================================================================
    // 2. PARAMETRE ALAN AMA DEĞER DÖNDÜRMEYEN (VOID) METOT
    // =========================================================================
    // Metot parantezinde tanımlanan değişkenlere PARAMETRE denir.
    // İstediğin kadar parametre ekleyebilirsin, aralarına virgül konur.
    public static void kullaniciyiKarsila(String isim, int yas) {
        System.out.println("Hoş geldin " + isim + "! Kayıtlı yaşın: " + yas);
    }


    // =========================================================================
    // 3. PARAMETRE ALAN VE DEĞER DÖNDÜREN (RETURN) METOT
    // =========================================================================
    // Dönüş tipi: int (Metot tamamlandığında geriye mutlaka bir tam sayı döner).
    // 'return': Üretilen sonucu metodun çağrıldığı satıra fırlatır ve metodu anında bitirir.
    public static int ikiSayiyiTopla(int sayi1, int sayi2) {
        int toplam = sayi1 + sayi2;
        return toplam; // Geriye int değer dönüyor
    }


    // =========================================================================
    // 4. ŞARTA BAĞLI RETURN VE ERKEN ÇIKIŞ (EARLY EXIT)
    // =========================================================================
    // Dönüş tipi void olmayan metotlarda HER KOŞUL YOLU mutlaka bir return görmelidir.
    // 'return' çalıştığı anda alttaki satırlara bakılmaz, metottan derhal çıkılır.
    public static String sinavSonucuBelirle(int puan) {
        if (puan >= 50) {
            return "Geçti"; // Puan 50 ve üzeri ise burası çalışır ve biter
        }
        return "Kaldı";     // 50'den küçükse bu satır çalışır
    }


    // =========================================================================
    // 5. İÇ İÇE METOT ÇAĞRIMLARI (NESTED METHOD CALLS)
    // =========================================================================
    // Bir metot kendi gövdesi içerisinden başka bir metodu doğrudan çağırabilir.
    public static double kdvHesapla(double tutar) {
        return tutar * 0.20; // %20 KDV hesaplar
    }

    public static double toplamFaturaHesapla(double hamTutar) {
        // kdvHesapla metodu burada çağrılıyor:
        double kdv = kdvHesapla(hamTutar);
        return hamTutar + kdv;
    }


    // =========================================================================
    // 6. STATIC OLMAYAN (INSTANCE) METOT
    // =========================================================================
    // Başında 'static' kelimesi YOKTUR.
    // Bu metoda sınıfın adıyla doğrudan erişilemez; önce bir nesne (object) üretilmelidir.
    public void nesneMetodu() {
        System.out.println("Bu metot nesne üzerinden (new ile) çağrıldı!");
    }



    // =========================================================================
    // MAIN METODU: PROGRAMIN ÇALIŞMA VE ÇAĞRI MERKEZİ
    // =========================================================================
    public static void main(String[] args) {

        System.out.println("=== 1. PARAMETRESİZ METOT ÇAĞRISI ===");
        // Çağırmak için sadece metodun adını yazar ve parantez açıp kapatırız:
        ekranaSelamVer();


        System.out.println("\n=== 2. PARAMETRELİ METOT VE ARGÜMAN KULLANIMI ===");
        // Buradaki "Ahmet" ve 21 değerleri birer ARGÜMANDIR:
        // Java bu değerlerin sırasını, adedini ve tür uyumluluğunu kontrol eder.
        kullaniciyiKarsila("Ahmet", 21);


        System.out.println("\n=== 3. DEĞER DÖNDÜREN METODU KULLANMA YÖNTEMLERİ ===");
        // Yöntem A: Dönen değeri bir değişkende saklama
        int gelenSonuc = ikiSayiyiTopla(15, 35);
        System.out.println("Değişkende saklanan toplam: " + gelenSonuc);

        // Yöntem B: Dönen değeri doğrudan System.out.println içine gömme
        System.out.println("Doğrudan ekrana yazdırılan toplam: " + ikiSayiyiTopla(40, 60));


        System.out.println("\n=== 4. ŞARTLI RETURN TESTİ ===");
        String ogrenci1 = sinavSonucuBelirle(75);
        String ogrenci2 = sinavSonucuBelirle(35);
        System.out.println("75 Puan Sonucu : " + ogrenci1); // Geçti
        System.out.println("35 Puan Sonucu : " + ogrenci2); // Kaldı


        System.out.println("\n=== 5. İÇ İÇE METOT ÇAĞRISI TESTİ ===");
        double fatura = toplamFaturaHesapla(100.0);
        System.out.println("100 TL'nin KDV Dahil Toplamı: " + fatura + " TL");


        System.out.println("\n=== 6. STATIC VE INSTANCE METOT ÇAĞRI FARKI ===");
        // Static metodun doğrudan çağrımı:
        ekranaSelamVer();

        // Instance metodun çağrımı:
        // nesneMetodu(); // HATA! Static bağlamdan nesnesiz çağrılamaz.
        // Doğru çağrım: Önce nesne üretilir, sonra çağrılır:
        Metotlar nesne = new Metotlar();
        nesne.nesneMetodu();

    } // main sonu
} // class sonu
