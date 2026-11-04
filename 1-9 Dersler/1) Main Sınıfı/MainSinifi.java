// Java'da yazılan her kod mutlaka bir sınıf (class) yapısının içinde yer almalıdır.
// Dosya ismi ile buradaki 'public class' ismi birebir aynı olmalıdır (MainSinifi.java).
public class MainSinifi {

    // === MAIN METODU (GİRİŞ KAPISI) ===
    // Java bir programı çalıştırırken ilk olarak bu imzaya sahip metodu arar ve buradan başlar.
    // Bu satırın her bir kelimesinin sınav için kritik bir anlamı vardır:
    //
    // 1. public: Erişim belirleyicidir. JVM'in (Java Sanal Makinesi) bu metoda sınıfın dışından,
    //    her yerden doğrudan erişebilmesini sağlar.
    //
    // 2. static: Bu metodun sınıftan bağımsız olduğunu gösterir.
    //    JVM, bu sınıfın bir nesnesini (new) üretmeden metodu doğrudan çalıştırabilir.
    //
    // 3. void: Dönüş tipidir. Metot işini bitirdiğinde geriye hiçbir veri döndürmez (boştur).
    //
    // 4. main: Metodun adıdır. Java standart olarak programı buradan başlatmak üzere bu ismi arar.
    //
    // 5. String[] args: Metodun parametre listesidir. Programa dışarıdan (konsoldan/terminalden)
    //    verilebilecek metin tabanlı komut satırı argümanlarını bir dizi olarak yakalar.
    public static void main(String[] args) {

        // System.out.println():
        // Metni veya veriyi konsola basar ve işlem bitince bir alt satıra geçer.
        System.out.println("Java programı çalışmaya başladı!");

        // System.out.print():
        // Metni ekrana yazar ama alt satıra GEÇMEZ, imleç yazının hemen yanında kalır.
        System.out.print("Bu yazı tek satırda ");
        System.out.print("devam eder.\n"); // '\n' kaçış karakteri manuel olarak alt satıra atar.

        // Basit bir hesaplama ve ekrana yazdırma örneği:
        int sayi1 = 10;
        int sayi2 = 20;
        int toplam = sayi1 + sayi2;

        // Metin birleştirme operatörü (+) kullanımı:
        System.out.println("Sayıların Toplamı: " + toplam);

    } // main metodunun gövdesi burada biter.
    
} // MainSinifi sınıfının gövdesi burada biter.
