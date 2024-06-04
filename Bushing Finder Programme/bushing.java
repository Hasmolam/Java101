import java.util.*;;

public class bushing {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int day;
        String month;

        System.out.print("Enter the month you were born: ");
        month = input.nextLine().toLowerCase();

        System.out.print("Enter the day you were born: ");
        day = input.nextInt();

        if (month.equals("january ")){
            if(day >= 1 && day <= 31){
                if(day >= 22){
                    System.out.println("Aquarius");
                }
                if(day < 22){
                    System.out.println("Capricorn");
                }
            } else {
                System.out.println("Invalid input");
            }
            
        } else if (month.equals("february ")){
            if(day >= 1 && day <= 29){
                if(day >= 20){
                    System.out.println("Pisces");
                }
                if(day < 19){
                    System.out.println("Aquarius");
                }
            }  else {
                System.out.println("Invalid input");
            } 
        } else if (month.equals("march")){
            if(day >= 1 && day <= 31){
                if(day >= 21){
                    System.out.println("Aries");
                }
                if(day < 21){
                    System.out.println("Pisces");
                } 
                }else {
                System.out.println("Invalid input");
            }
            
        } else if (month.equals("april")){
            if(day >= 1 && day <= 30){
                if(day >= 21){
                    System.out.println("Taurus");
                }
                if(day < 21){
                    System.out.println("Aries");
                }
            }else   {
                System.out.println("Invalid input");
            }
           
        } else if (month.equals("may")){
            if(day >= 1 && day <= 31){
                if(day >= 22){
                    System.out.println("Gemini");
                }
                if(day < 22){
                    System.out.println("Taurus");
                }
            }else {
                System.out.println("Invalid input");
            }
           
        } else if (month.equals("june")){
            if(day >= 1 && day <= 30){
                if(day >= 23){
                    System.out.println("Cancer");
                }
                if(day < 23){
                    System.out.println("Gemini");
                }
            } else {
                System.out.println("Invalid input");
            }
            
        }else if (month.equals("july")){
            if(day >= 1 && day <= 31){
                if(day >= 23){
                    System.out.println("Leo");
                }
                if(day < 23){
                    System.out.println("Cancer");
                }
            }else {
                System.out.println("Invalid input");
            }
            
        }else if (month.equals("august")){
            if(day >= 1 && day <= 31){
                if(day >= 23){
                    System.out.println("Virgo");
                }
                if(day < 23){
                    System.out.println("Leo");
                }
            }else {
                System.out.println("Invalid input");
            }
        }else if (month.equals("september")){
            if(day >= 1 && day <= 30){
                if(day >= 23){
                    System.out.println("Libra");
                }
                if(day < 23){
                    System.out.println("Virgo");
                }
            }else {
                System.out.println("Invalid input");
            }
        } else if (month.equals("october")){
            if(day >= 1 && day <= 31){
                if(day >= 23){
                    System.out.println("Scorpio");
                }
                if(day < 23){
                    System.out.println("Libra");
                }
            }else {
                System.out.println("Invalid input");
            }
        }else if (month.equals("november")){
            if(day >= 1 && day <= 30){
                if(day >= 22){
                    System.out.println("Sagittarius");
                }
                if(day < 22){
                    System.out.println("Scorpio");
                }
            }else {
                System.out.println("Invalid input");
            }
        }else if (month.equals("december")){
            if(day >= 1 && day <= 31){
                if(day >= 22){
                    System.out.println("Capricorn");
                }
                if(day < 22){
                    System.out.println("Sagittarius");
                }
            }else {
                System.out.println("Invalid input");
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
