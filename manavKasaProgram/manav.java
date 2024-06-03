import java.util.Scanner;


public class manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armut, elma, domates, muz, patlican, total;
        double armutf=2.14, elmaf=3.67, domatesf=1.11, muzf=0.95, patlicanf=5.0;

        System.out.print("Armut Kaç Kilo? :");
        armut = input.nextDouble();
        System.out.print("Elma Kaç Kilo? :");
        elma = input.nextDouble();
        System.out.print("Domates Kaç Kilo? :");
        domates = input.nextDouble();
        System.out.print("Muz Kaç Kilo? :");
        muz = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo? :");
        patlican = input.nextDouble();

        total = armut*armutf + elma*elmaf + domates*domatesf + muz*muzf + patlican*patlicanf;
        System.out.println("Toplam Tutar : " + total + " TL");    

    }
}
