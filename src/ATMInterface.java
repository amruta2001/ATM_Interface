import java.util.Scanner;
public class ATMInterface {
    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int balance=20000, withdraw, deposit,choice;

        while (true) { 
            System.out.println("********** WELCOME TO THE ATM MACHINE**********");
            System.out.println("ATM Menu:");
            System.out.println("1. Cash Withdrawal");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit to the ATM");

            System.out.println("Enter Your Choice:");
            choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter Amount to be Withdraw");
                    withdraw=sc.nextInt();
                    if(balance>=withdraw){
                        balance=balance-withdraw;
                        System.out.println("Balance Amount is: "+balance);
                        System.out.println("Please collect money");
                    }
                    else{
                        System.out.println("You don't have enough for money withdraw");
                    }
                    System.out.println(" ");    
                    break;

                case 2:
                    System.out.println("Enter Amount to Deposit");
                    deposit=sc.nextInt();
                    balance=balance+deposit;
                    System.out.println("Balance Amount is: "+balance);
                    System.out.println("Money has been deposited succeessfully...");
                    System.out.println(" ");
                    break;

                case 3:
                    System.out.println("Balance of your Account is: "+balance);
                    System.out.println(" ");
                    break;

                case 4:
                System.out.println("Exiting ATM...Thank You...!");
                    System.exit(0);
                    System.out.println(" ");
                    break;

                default:
                System.out.println("Invalid Choice...! Ooops...Please enter the valid choice...!");
            }
        }
    }

}