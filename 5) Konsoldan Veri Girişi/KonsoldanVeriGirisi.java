// Bu sınıf; Scanner sınıfının kullanımını, tüm temel tip okuma metotlarını
// ve 'nextInt()' sonrasında yaşanan 'nextLine()' atlama probleminin çözümünü içerir.

// 1. ADIM: Scanner sınıfını Java'nın yardımcı kütüphanesinden içe aktarıyoruz:
import java.util.Scanner;

public class KonsoldanVeriGirisi {

    public static void main(String[] args) {

        // 2. ADIM: Scanner nesnesi oluşturulur.
        // 'System.in' parametresi, girdinin standart klavyeden alınacağını belirtir.
        Scanner input = new Scanner(System.in);

        System.out.println("=== 1. SAYISAL VE MANTIKSAL TİPLERİ OKUMA ===");

        // nextByte(): byte okur (-128 ile 127 arası)
        System.out.print("Bir byte değeri girin (-128 ile 127 arası): ");
        byte b = input.nextByte();
        System.out.println("Girilen byte: " + b);

        // nextShort(): short okur
        System.out.print("Bir short tam sayı girin: ");
        short s = input.nextShort();
        System.out.println("Girilen short: " + s);

        // nextInt(): int tam sayı okur
        System.out.print("Bir int tam sayı girin: ");
        int i = input.nextInt();
        System.out.println("Girilen tam sayı: " + i);

        // nextLong(): long tam sayı okur
        System.out.print("Bir long tam sayı girin: ");
        long l = input.nextLong();
        System.out.println("Girilen long: " + l);

        // nextFloat(): float ondalıklı sayı okur
        System.out.print("Bir float ondalıklı sayı girin: ");
        float f = input.nextFloat();
        System.out.println("Girilen float: " + f);

        // nextDouble(): double ondalıklı sayı okur
        System.out.print("Bir double ondalıklı sayı girin: ");
        double d = input.nextDouble();
        System.out.println("Girilen double: " + d);

        // nextBoolean(): true veya false okur
        System.out.print("Bir boolean değer girin (true/false): ");
        boolean aktifMi = input.nextBoolean();
        System.out.println("Girilen boolean: " + aktifMi);


        System.out.println("\n=== 2. METİN OKUMA: next() vs nextLine() ===");

        // next(): İlk boşluğa (space) kadar olan tek bir kelimeyi okur.
        // Kullanıcı "Ali Veli" yazsa bile sadece "Ali" kısmını alır!
        System.out.print("Tek bir kelime girin (Adınız): ");
        String ad = input.next();
        System.out.println("next() ile okunan: " + ad);


        // =====================================================================
        // 3. EN ÇOK ÇIKAN SINAV TUZAĞI: BUFFER (TAMPON) ATLAMA PROBLEMİ
        // =====================================================================
        // next(), nextInt() veya nextDouble() sonrasında Enter tuşuna basıldığında
        // satır sonu karakteri (\n) bellekte kalır.
        // Hemen ardından gelen nextLine(), bu \n karakterini görüp "satır bitti" sanar
        // ve kullanıcıdan yazı beklemeden boş geçer!
        //
        // ÇÖZÜM: Tamponda biriken \n karakterini temizlemek için boş bir nextLine() çağrılır:
        input.nextLine(); // TAMPON TEMİZLEME ADIMI

        // nextLine(): Enter'a basılana kadar yazılan tüm cümleyi okur.
        System.out.print("Tam bir cümle girin (Bölümünüz ve Üniversiteniz): ");
        String cumle = input.nextLine();
        System.out.println("nextLine() ile okunan: " + cumle);


        System.out.println("\n=== 3. PRATİK FATURA HESAPLAMA ÖRNEĞİ ===");
        // Quiz sorularında da çıkan klasik kullanıcıdan fiyat ve adet alma senaryosu:
        System.out.print("Ürün birim fiyatını giriniz: ");
        double birimFiyat = input.nextDouble();

        System.out.print("Satın alınan ürün adedini giriniz: ");
        int adet = input.nextInt();

        double araToplam = birimFiyat * adet;
        double kdv = araToplam * 0.10; // %10 KDV
        double genelToplam = araToplam + kdv;

        System.out.println("Ara Toplam   : " + araToplam + " TL");
        System.out.println("KDV Tutarı   : " + kdv + " TL");
        System.out.println("Toplam Tutar : " + genelToplam + " TL");

        // 4. ADIM: Scanner nesnesi ile iş bittiğinde kapatılması belleği temizler:
        input.close();

    } // main sonu
} // class sonu
