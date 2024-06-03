import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String userName, password, realPassword;
        int secim1;

        System.out.print("Kullanıcı Adını Giriniz: ");
        userName = input.nextLine();

        System.out.print("Şifreyi Giriniz: ");
        password = input.nextLine();

        realPassword = "Java123";

        if(userName.equals("patika") && password.equals(realPassword)){
            System.out.println("Giriş Yaptınız!");
        }else{
            System.out.println("Bilgileriniz Yanlış!");
            System.out.println("Şifrenizi sıfırlamak ister misiniz? : \n1-Evet\n2-Hayır");
            secim1 = input.nextInt();
            if (secim1 == 1){
                System.out.print("Yeni şifrenizi giriniz: ");
                String newPassword = input.next();
                if(newPassword.equals(realPassword)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else{
                    System.out.println("Şifre oluşturuldu.");
                }
            }else{
                System.out.println("Bir dahaki sefere doğru bilgileri giriniz!");
            }
        }
    }
}
