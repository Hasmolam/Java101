import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        double kenar1, kenar2, hipotenus, alan;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen ilk kenarı giriniz: ");
        kenar1 = input.nextDouble();
        System.out.print("Lütfen ikinci kenarı giriniz: ");
        kenar2 = input.nextDouble();

        hipotenus = java.lang.Math.sqrt(kenar1*kenar1+kenar2*kenar2);

        System.out.println("Hipotenüs: " + hipotenus); 

        alan = (kenar1*kenar2)/2;
        System.out.println("Üçgenin Alanı: " + alan);
    }

}
