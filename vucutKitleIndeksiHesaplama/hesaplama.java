import java.util.Scanner;

public class hesaplama {
    public static void main(String[] args) {
        double boy, kilo, index;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();

        index = kilo / (boy*boy);

        System.out.println("Vücut Kitle İndeksiniz : " + index);
    }

}
