import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        //Değişkenler
        double alinanPara, kdvlifiyat, kdvtutari, oran;

        //Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("KDV Tutarı Hesaplanacak Parayı Griniz: ");
        alinanPara = input.nextDouble();

        boolean kontrol1 = alinanPara < 1000;
        boolean kontrol2 = alinanPara > 0;
        boolean kontrol3 = kontrol1 && kontrol2;


        oran = kontrol3 ? 0.18 : 0.08;    
        kdvtutari = alinanPara * oran;
        kdvlifiyat = alinanPara + kdvtutari;

        // Yuvarlama işlemi
        kdvlifiyat = Math.round(kdvlifiyat * 100.0) / 100.0;
        kdvtutari = Math.round(kdvtutari * 100.0) / 100.0;


        System.out.println("KDV\'siz Fiyat: " + alinanPara);
        System.out.println("KDV\\'li Fiyat: " + kdvlifiyat);
        System.out.println("KDV Tutarı: " + kdvtutari);

        
        
    }

}
