import java.util.Scanner;    

public class ATM {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String userName,passWord;
        int right = 3,selection, balance=1500,price, finishValue=1;
        boolean isLogged = false;

        do{
        System.out.print("Enter user name: ");
        userName = input.nextLine();

        System.out.print("Enter password: ");
        passWord = input.nextLine();

        String combinated = userName + " " + passWord;

        switch(combinated){
            case "hasmolam 123":
                System.out.println("Logged in.");
                isLogged = true;
                break;
            default:
                System.out.println("Incorrect username or password");
                --right;
                System.out.println("You've got " + right + " left.");
                switch(right){
                    case 0:
                        System.out.println("Your account has been blocked");
                        break;
                    default:
                        break;
                }
                
        }
    }
    while(right!=0 && !(isLogged));

    do{

            System.out.println("1-Deposit\n2-Withdraw\n3-Enquire Balance\n4-Exit");
            System.out.print("Please select the action you want to perform: ");
            selection = input.nextInt();
            switch(selection){
                case 1:
                    System.out.print("Amount of money: ");
                    price = input.nextInt();
                    balance += price;
                    break;
                case 2:
                    System.out.print("Amount of money: ");
                    price = input.nextInt();
                    if(price > balance){
                        System.out.println("Insufficient balance");
                    }else{
                        balance -= price;
                    break;
                    }
                case 3:
                    System.out.println("Balance: " + balance); 
                    break; 
                case 4:
                    System.out.println("Have a good day");
                    --finishValue;
                    break;
                default:
                    System.out.println("Invalid input value");    
                        
                }
    }
    while (right!=0 && finishValue != 0 && isLogged);
            
      
    }
}
