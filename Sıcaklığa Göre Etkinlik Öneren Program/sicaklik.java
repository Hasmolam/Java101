import java.util.Scanner;

public class sicaklik {
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);

        double heat;

        System.out.print("Sıcaklığı Giriniz: ");
        heat = input.nextInt();

        if(heat < 5){
            System.out.println("Kayağa gidebilirsiniz!");
        } else if((heat < 10) && (heat > 5)){
            System.out.println("Sinemaya gidebilirsiniz!");
        } else if (heat >= 10 && heat <= 15){
            System.out.println("Sinemaya veya Pikniğe gidebilirsiniz!");
        } else if (heat < 25 && heat > 15){
            System.out.println("Pikniğe gidebilirsiniz!");
        } else if (heat >= 25){
            System.out.println("Yüzmeye gidebilirsiniz!");
        } else {
            System.out.println("Lüften geçerli bir sayı giriniz!");
        }
    }
}
