// Bu sınıf; Java'daki tüm karşılaştırma operatörlerini, çalışma çıktılarını
// ve sık yapılan derleme/mantık hatalarını örneklerle gösterir.
public class KarsilastirmaOperatorleri {

    public static void main(String[] args) {

        // Karşılaştırma için temel test değişkenleri tanımlayalım:
        int a = 10;
        int b = 20;

        System.out.println("=== 1. TEMEL KARŞILAŞTIRMA OPERATÖRLERİ ===");
        System.out.println("a = " + a + ", b = " + b);

        // == (Eşit mi?): İki tarafın değeri aynıysa true döner.
        boolean esitMi = (a == b); // 10 == 20 -> false
        System.out.println("a == b (Eşit mi?)            : " + esitMi);

        // != (Eşit değil mi?): İki tarafın değeri farklıysa true döner.
        boolean farkliMi = (a != b); // 10 != 20 -> true
        System.out.println("a != b (Eşit değil mi?)      : " + farkliMi);

        // > (Büyük mü?): Sol taraf sağdakinden büyükse true döner.
        boolean buyukMu = (a > b); // 10 > 20 -> false
        System.out.println("a > b  (a, b'den büyük mü?)  : " + buyukMu);

        // < (Küçük mü?): Sol taraf sağdakinden küçükse true döner.
        boolean kucukMu = (a < b); // 10 < 20 -> true
        System.out.println("a < b  (a, b'den küçük mü?)  : " + kucukMu);

        // >= (Büyük veya eşit mi?): Büyükse veya eşitse true döner.
        boolean buyukEsitMi = (a >= 10); // 10 >= 10 -> true
        System.out.println("a >= 10 (Büyük eşit mi?)     : " + buyukEsitMi);

        // <= (Küçük veya eşit mi?): Küçükse veya eşitse true döner.
        boolean kucukEsitMi = (b <= 15); // 20 <= 15 -> false
        System.out.println("b <= 15 (Küçük eşit mi?)     : " + kucukEsitMi);


        System.out.println("\n=== 2. SLAYTTAKİ SAYISAL ÖRNEK TESTLERİ ===");
        // Slaytta yer alan x = 8 ve y = 3 senaryosu:
        int x = 8;
        int y = 3;

        System.out.println("x = 8, y = 3 iken:");
        System.out.println("x < y       : " + (x < y));       // false
        System.out.println("x <= 10     : " + (x <= 10));     // true
        System.out.println("x > y       : " + (x > y));       // true
        System.out.println("x <= y      : " + (x <= y));      // false
        System.out.println("x == y      : " + (x == y));      // false
        System.out.println("x != (-4)   : " + (x != (-4)));   // true


        System.out.println("\n=== 3. CHAR TİPİNDE KARŞILAŞTIRMA ===");
        // Karakterler arka planda sayısal ASCII/Unicode değerleri taşıdığı için
        // karşılaştırma operatörleriyle doğrudan kıyaslanabilirler:
        char harf1 = 'A'; // ASCII karşılığı: 65
        char harf2 = 'B'; // ASCII karşılığı: 66

        boolean charKarsilastirma = (harf1 < harf2); // 65 < 66 -> true
        System.out.println("'A' < 'B' sonucu: " + charKarsilastirma);


        System.out.println("\n=== 4. EN ÇOK YAPILAN SINAV TUZAKLARI ===");

        // TUZAK 1: '=' ile '==' KARIŞTIRILMASI
        int sinavNotu = 75;

        // YANLIŞ KULLANIM (Hata ayıklama sorusu olarak çıkar):
        // if (sinavNotu = 50) { ... } // DERLEME HATASI! Tek '=' atamadır, boolean üretmez.

        // DOĞRU KULLANIM:
        if (sinavNotu == 50) {
            System.out.println("Not tam olarak 50.");
        } else {
            System.out.println("Not 50 değil, gerçek not: " + sinavNotu);
        }

        // TUZAK 2: MATEMATİKSEL ÇİFT TARAFLI KIYASLAMA HATASI
        int yas = 20;

        // YANLIŞ KULLANIM:
        // if (18 <= yas <= 65) { ... } // DERLEME HATASI! Java zincirleme kıyaslama yapamaz.

        // DOĞRU KULLANIM:
        // İki ayrı karşılaştırma yapılıp mantıksal '&&' (VE) ile bağlanmalıdır:
        if (yas >= 18 && yas <= 65) {
            System.out.println("Çalışma çağı aralığında (18 ile 65 yaş dahil).");
        }

    } // main sonu
} // class sonu
