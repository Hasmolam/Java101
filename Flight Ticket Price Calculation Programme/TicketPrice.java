import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double km, perKm=0.10, total;
        int age;
        int travelType;

        //User input
        System.out.print("Enter the number of kilometers: ");
        km = input.nextDouble();
        System.out.print("Enter the age: ");
        age = input.nextInt();

        //Travel type
        System.out.println("Choose your travel type: ");
        System.out.println("1. One Way");
        System.out.println("2. Two Way");
        travelType = input.nextInt();

        //Ticket price
        if(km < 0 || age < 0 || age > 150){
            System.out.println("Invalid input");
            return;
        }
        if(travelType == 1){
            if(age < 12){
                total = (km*perKm)/2;
            } else if(age >= 12 && age <= 24){
                total = (km*perKm)*0.9;
            } else if(age > 65){
                total = (km*perKm)*0.7;
            } else {
                total = (km*perKm);
            } 
            System.out.println("Total ticket price: " + total + " TL");
        }
        else if(travelType == 2){
            if(age < 12){
                total = (km*perKm)/2;
                total = total*0.8;
            } else if(age >= 12 && age <= 24){
                total = (km*perKm)*0.9;
                total = total*0.8;
            } else if(age > 65){
                total = (km*perKm)*0.7;
                total = total*0.8;
            } else {
                total = (km*perKm);
                total = total*0.8;
            } ;
            System.out.println("Total ticket price: " + total*2 + " TL");
    }   else{
        System.out.println("Invalid input");
    }

    
}   
}
