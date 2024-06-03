import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n1,n2;
        int secim;

        System.out.print("1.Sayıyı Giriniz: ");
        n1 = input.nextDouble();
        System.out.print("2.Sayıyı Giriniz: ");
        n2 = input.nextDouble();

        System.out.println("İşlem Seçiniz:");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçim: ");
        secim = input.nextInt();

        switch(secim){
            case 1:
                System.out.println("Toplam: " + (n1+n2));
                break;
            case 2:
                System.out.println("Fark: " + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpım: " + (n1 * n2));
                break;
            case 4:
                if(n2==0){
                    System.out.println("Sayılar 0'a bölünemez!");
                }else{
                    System.out.println("Bölüm: " + (n1/n2));
                }     
                break;
            default:
                System.out.println("Yanlış bir seçim yaptınız.");        
            }

        }
    }

