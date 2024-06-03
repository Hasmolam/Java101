import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double r, pi=3.14, alan, cevre, a, dilimAlan;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin Yarıçapını Giriniz: ");
        r = input.nextDouble();

        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);

        System.out.print("Dairenin Diliminin Açısını Giriniz: ");
        a = input.nextDouble();

        dilimAlan = (pi * r * r * a)/360;

        System.out.println("Daire Diliminin Alanı: " + dilimAlan);
    }


}
