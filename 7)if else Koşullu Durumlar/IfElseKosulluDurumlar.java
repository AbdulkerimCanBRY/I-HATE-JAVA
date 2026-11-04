// I-HATE-JAVA / Ders07_IfElseKosulluDurumlar.java
// Bu sınıf; if, if-else, else-if merdiveni, nested if,
// ternary operatörü ve sık yapılan mantık hatalarını içerir.

public class IfElseKosulluDurumlar {

    public static void main(String[] args) {

        System.out.println("=== 1. TEKİL IF DEYİMİ ===");
        // Koşul true ise blok çalışır, false ise hiçbir şey yapmadan atlar.
        int yas = 19;

        if (yas >= 18) {
            System.out.println("Seçimlerde oy kullanabilirsiniz.");
        }


        System.out.println("\n=== 2. IF - ELSE DEYİMİ ===");
        // Bakiye ve para çekme kontrolü (Slayttaki klasik ATM örneği):
        int bakiye = 350;
        int cekilmekIstenen = 400;

        if (cekilmekIstenen <= bakiye) {
            System.out.println("İşlem onaylandı, paranızı alınız.");
        } else {
            System.out.println("Yetersiz bakiye! Mevcut bakiye: " + bakiye + " TL");
        }


        System.out.println("\n=== 3. ELSE - IF BASAMAKLI MERDİVENİ ===");
        // Aralıkların test edilmesi ve harf notu belirleme:
        // Sınav kuralı: Notlandırmadan önce değerin 0-100 arasında olduğunu doğrulayın!
        int sinavNotu = 76;

        if (sinavNotu < 0 || sinavNotu > 100) {
            System.out.println("HATA: Sınav notu 0 ile 100 arasında olmalıdır!");
        } else if (sinavNotu >= 90) {
            System.out.println("Harf Notu: A");
        } else if (sinavNotu >= 80) {
            System.out.println("Harf Notu: B");
        } else if (sinavNotu >= 70) {
            // 76 değeri bu aralığa girer ve doğrudan burası çalışır:
            System.out.println("Harf Notu: C");
        } else if (sinavNotu >= 60) {
            System.out.println("Harf Notu: D");
        } else {
            System.out.println("Harf Notu: F (Kaldınız)");
        }


        System.out.println("\n=== 4. İÇ İÇE IF (NESTED IF) YAPISI ===");
        // Güvenli giriş simülasyonu: İlk aşama parola, ikinci aşama OTP kodu:
        boolean sifreDogruMu = true;
        boolean tekKullanimlikKodDogruMu = false;

        if (sifreDogruMu) {
            // Şifre doğruysa içerideki ikinci kontrole geçilir:
            if (tekKullanimlikKodDogruMu) {
                System.out.println("Giriş başarılı: Sisteme erişim izni verildi.");
            } else {
                System.out.println("Şifre doğru fakat OTP doğrulama kodu hatalı!");
            }
        } else {
            System.out.println("Geçersiz kullanıcı bilgileri!");
        }


        System.out.println("\n=== 5. KOŞUL / TERNARY OPERATÖRÜ (? :) ===");
        // Söz dizimi: kosul ? dogru_ise : yanlis_ise;
        int ortamSicakligi = 31;
        String durum = (ortamSicakligi > 30) ? "Hava Sıcak" : "Hava Normal";
        System.out.println("Ternary ile durum tespiti: " + durum);


        System.out.println("\n=== 6. SINAVLARDA ÇIKAN KRİTİK SÖZ DİZİMİ TUZAKLARI ===");

        // TUZAK 1: Süslü parantez { } kullanılmaması
        int x = 5;
        if (x > 10)
            System.out.println("Bu satır if'e bağlıdır (ÇALIŞMAZ).");
            System.out.println("DİKKAT: Bu satır if'in DIŞINDADIR ve koşul false olsa da EKRANA BASILIR!");

        // TUZAK 2: Atama (=) ile Kıyaslama (==) farkı
        int puan = 50;
        // if (puan = 50) { ... } // HATA: Derlenmez! Tek eşittir atama yapar.
        if (puan == 50) {
            System.out.println("Kıyaslama doğru: Puan 50'ye eşittir.");
        }

    } // main sonu
} // class sonu
