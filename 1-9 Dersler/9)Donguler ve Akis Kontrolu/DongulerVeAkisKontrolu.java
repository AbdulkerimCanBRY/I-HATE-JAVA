// Bu sınıf; for, while, do-while döngülerini, break-continue farkını,
// sayaç/biriktirici mantığını ve sınavdaki iç içe desen sorularını içerir.

import java.util.Scanner;

public class DongulerVeAkisKontrolu {

    public static void main(String[] args) {

        System.out.println("=== 1. FOR DÖNGÜSÜ ===");
        // for(ilklendirme; kosul; guncelleme)
        // Çalışma sırası: i=1 -> i<=5 kontrolü -> Gövde çalışır -> i++ -> Tekrar kontrol
        System.out.print("1'den 5'e kadar sayılar: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Slayttaki klasik sınav sorusu:
        // for (int i = 0; i < 5; i += 2) kodunun çıktısı nedir?
        System.out.print("i += 2 artış çıktısı: ");
        for (int i = 0; i < 5; i += 2) {
            System.out.print(i + " "); // Çıktı: 0 2 4
        }
        System.out.println();


        System.out.println("\n=== 2. WHILE DÖNGÜSÜ VE SONSUZ DÖNGÜ TEHLİKESİ ===");
        // Koşul doğru olduğu sürece döner.
        int girisDenemesi = 0;
        while (girisDenemesi < 3) {
            System.out.println("Giriş deneniyor... Deneme no: " + (girisDenemesi + 1));
            // KRİTİK: girisDenemesi++ unutulursa döngü sonsuza kadar çalışır!
            girisDenemesi++;
        }

        // Koşul en başta false olursa while hiç çalışmaz (0 kez çalışır):
        int testDegeri = 100;
        while (testDegeri < 50) {
            System.out.println("Bu satır asla ekrana basılmaz!");
        }


        System.out.println("\n=== 3. DO-WHILE DÖNGÜSÜ VE GİRDİ DOĞRULAMA ===");
        // do-while koşul yanlış olsa bile EN AZ BİR KEZ çalışır.
        int doWhileTest = 10;
        do {
            System.out.println("Koşul (10 < 5) yanlış olmasına rağmen bu satır 1 kez basıldı.");
        } while (doWhileTest < 5);

        // Kullanıcıdan geçerli not alana kadar tekrar sorma (Input Validation mantığı):
        // Sınavlarda 0-100 aralığı dışındaki notları reddetmek için kullanılır.
        int sahteKullaniciNotu = 120; // Hatalı bir not varsayalım
        int donguSayaci = 0;
        do {
            if (sahteKullaniciNotu < 0 || sahteKullaniciNotu > 100) {
                // Not geçersizse düzeltildiğini simüle ediyoruz:
                sahteKullaniciNotu = 85; 
            }
            donguSayaci++;
        } while (sahteKullaniciNotu < 0 || sahteKullaniciNotu > 100);
        System.out.println("Geçerli not kabul edildi: " + sahteKullaniciNotu);


        System.out.println("\n=== 4. BREAK VE CONTINUE FARKI ===");
        // Slayttaki trace örneği: 1'den 8'e kadar dönen döngü
        System.out.print("Break/Continue çıktısı: ");
        for (int n = 1; n <= 8; n++) {
            if (n == 3) {
                // continue: 3'ü atlar, yazdırma satırına inmeden n=4'e zıplar:
                continue;
            }
            if (n == 7) {
                // break: 7'ye ulaşıldığı an döngüyü tamamen sonlandırır:
                break;
            }
            System.out.print(n + " ");
        }
        // Konsol çıktısı: 1 2 4 5 6 (3 atlandı, 7'de döngü bitti)
        System.out.println();


        System.out.println("\n=== 5. SAYAÇ (COUNTER) VE BİRİKTİRİCİ (ACCUMULATOR) ===");
        // 1 ile 10 arasındaki çift sayıların toplamını ve adedini bulalım:
        int ciftSayac = 0;      // Counter: Kaç adet olduğunu sayar
        int toplamBiriktirici = 0; // Accumulator: Değerleri toplar

        for (int sayi = 1; sayi <= 10; sayi++) {
            if (sayi % 2 == 0) {
                toplamBiriktirici += sayi; // Üzerine ekler
                ciftSayac++;               // Adedi 1 artırır
            }
        }
        System.out.println("Çift sayı adedi (Sayaç): " + ciftSayac);
        System.out.println("Çift sayıların toplamı (Biriktirici): " + toplamBiriktirici);


        System.out.println("\n=== 6. İÇ İÇE DÖNGÜLER: QUIZ-3 DESEN ÇÖZÜMLERİ ===");

        // DESEN A:
        // 1
        // 12
        // 123
        // 1234
        // 12345
        System.out.println("--- Desen A ---");
        for (int i = 1; i <= 5; i++) { // Satır kontrolü
            for (int j = 1; j <= i; j++) { // Sütun kontrolü (satır numarasına kadar basar)
                System.out.print(j);
            }
            System.out.println(); // Satır bitince alt satıra geç
        }

        // DESEN B:
        // 12345
        // 1234
        // 123
        // 12
        // 1
        System.out.println("\n--- Desen B ---");
        for (int i = 5; i >= 1; i--) { // Satır 5'ten 1'e doğru azalır
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // DESEN C:
        // *
        // **
        // ***
        // ****
        // *****
        System.out.println("\n--- Desen C ---");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    } // main sonu
} // class sonu
