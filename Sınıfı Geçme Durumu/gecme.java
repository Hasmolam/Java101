import java.util.Scanner;

public class gecme {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int mat, fizik, turkce, kimya, muzik, toplamDers=5;

        System.out.println("Matematik Notunu Giriniz: ");
        mat = input.nextInt();
        if((mat < 0 ) || (mat > 100)){
            mat = 0;
            toplamDers -= 1;
        }
        
        System.out.println("Fizik Notunu Giriniz: ");
        fizik = input.nextInt();
        if((fizik < 0 ) || (fizik > 100)){
            fizik = 0;
            toplamDers -= 1;
        }

        System.out.println("Türkçe Notunu Giriniz: ");
        turkce = input.nextInt();
        if((turkce < 0 ) || (turkce > 100)){
            turkce = 0;
            toplamDers -= 1;
        }

        System.out.println("Kimya Notunu Giriniz: ");
        kimya = input.nextInt();
        if((kimya < 0 ) || (kimya > 100)){
            kimya = 0;
            toplamDers -= 1;
        }

        System.out.println("Müzik Notunu Giriniz: ");
        muzik = input.nextInt();
        if((muzik < 0 ) || (muzik > 100)){
            muzik = 0;
            toplamDers -= 1;
        }

        double ortalama = (toplamDers==0) ? 0 : ((mat + fizik + turkce + kimya + muzik) / toplamDers);
        

        if(ortalama < 55){
            System.out.println("Sınıfta Kaldınız.");
        }else{
            System.out.println("Sınıfı Geçtiniz!");
        }
        System.out.println("Ortalamanız: " + ortalama);
    }
}
