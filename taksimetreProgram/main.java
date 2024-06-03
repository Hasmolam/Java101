import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        double km,tutar,acilis=10, kmOrani=2.20, sontutar;

        Scanner input = new Scanner(System.in);

        System.out.println("Kaç KM İlerlediniz?");
        km = input.nextDouble();

        tutar = acilis + km*kmOrani;
        boolean kontrol = tutar < 20;

        sontutar = kontrol ? 20 : tutar;

        System.out.println("Ödemeniz Gereken Para: " + sontutar);

    }
}
