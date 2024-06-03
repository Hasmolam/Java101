import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunu Giriniz :");
        mat = input.nextInt();
        
        System.out.print("Fizik Notunu Giriniz :");
        fizik = input.nextInt();
        
        System.out.print("Kimya Notunu Giriniz :");
        kimya = input.nextInt();
        
        System.out.print("Türkçe Notunu Giriniz :");
        turkce = input.nextInt();
        
        System.out.print("Tarih Notunu Giriniz :");
        tarih = input.nextInt();
        
        System.out.print("Müzik Notunu Giriniz :");
        muzik = input.nextInt();
        
        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplam / 6;

        System.out.println(ortalama);

        boolean kontrol = ortalama > 60;

        String kontrolSonucu = kontrol ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(kontrolSonucu);

    }

}
