package ATM;

import java.util.Scanner;

public class Options extends Account {
    Scanner menuInput = new Scanner(System.in);

    public void savings() {
        System.out.print("\nEnter your mobile Number: ");
        long mob = menuInput.nextLong();
        System.out.print("\nSet your pin Number: ");
        int pin = menuInput.nextInt();
        setPinNumber(pin);

        System.out.println("\nRedirect to your account...........");
        System.out.print("\nEnter your pin Number: ");
        int newpin = menuInput.nextInt();
//        getPinNumber();
        if (newpin == getPinNumber()) {

            boolean checkk = true;
//=======
            System.out.println("\nPress 1 for Adding balance: ");
            System.out.println("Press anything for continue: ");
            int add = menuInput.nextInt();
            if (add == 1) {
                System.out.print("\nAmount you want to adding: ");
                double bal = menuInput.nextDouble();
                setBalance(bal);
            }
            else{
                checkk=true;
            }


            while (checkk) {
                try {
                    System.out.println("\nSavings Account: ");
                    System.out.println("Press 1 - View Balance");
                    System.out.println("Press 2 - Withdraw Funds");
                    System.out.println("Press 3 - Deposit Funds");
                    System.out.println("Press 4 - Exit");
                    System.out.print("Choice: ");
                    int select = menuInput.nextInt();
                    switch (select) {
                        case 1:
                            System.err.println("Your Account balance: " + getBalance());
                            break;
                        case 2:
                            withdrawInput();
//                            System.out.println(" ");
                            break;
                        case 3:
                            depositInput();
                            break;
                        case 4:
                            System.out.println("Thank you..Visit again");
                            checkk=false;
                            break;
                        default:
                            System.out.println("\nInvalid choice ");
                    }

                } catch (Exception e) {
                    System.out.println("\nInvalid Choice");
                    menuInput.next();
                }
            }
        } else {
            System.out.println("\nWrong pin");
          savings();
        }
    }
}

// Thread using on dot line
class card{
    static void card(){
        System.out.print("Please insert your card");
    }
}
class dot extends Thread{
    public void run(){
        for (int i=0;i<=5;i++){
            System.out.print(".");
            try {
                Thread.sleep(560);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("\n");
    }
}