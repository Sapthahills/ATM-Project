package ATM;

import java.util.Scanner;

public class Account {

    private long mobNumber;
    private int pinNumber;
    private double balance=0;

    Scanner input=new Scanner(System.in);
    public long setMobNumber(long mobNumber){
        this.mobNumber=mobNumber;
        return mobNumber;
    }
    public long getMobNumber(){
        return mobNumber;
    }
    public int setPinNumber(int pinNumber){
        this.pinNumber=pinNumber;
        return pinNumber;
    }
    public int getPinNumber(){
        return pinNumber;
    }
//    ---------------------------------------
    public double setBalance(double balance){
        this.balance=balance;
        return balance;

    }
    public double getBalance(){
        return balance;
    }
//    ---------------------
    public double withdraw(double amount){
        balance -=amount;
        return balance;
    }
    public double deposit(double amount){
        balance +=amount;
        return balance;
    }
//-------------
    public void withdrawInput(){
        boolean check=true;
        while (check){
            try {

                System.err.println("\nYour Current balance: "+balance);
                System.out.print("\nAmount you want to withdraw Ur account: ");
                double amoun=input.nextDouble();
                if ((balance - amoun)>=0 && amoun>=0){
                    withdraw(amoun);
                    System.out.println("\nWithdraw successfully..");
                    System.err.println("\nYour current balance: "+balance);
                    check=false;
                }
                else {
                    System.out.println("\nInsufficient balance");
                    check=false;
                }

            }
            catch (Exception e){
                System.out.println("\nInvalid choice");
                e.printStackTrace();
            }
        }
    }

    public void depositInput(){
        boolean check=true;
        while (check) {
            try {

            System.err.println("\nYour current balance: "+balance);
            System.out.print("\nAmount you want to Deposit: ");
            double amoun=input.nextDouble();
            if ((balance + amoun)>=0 && amoun>=0) {
                deposit(amoun);
                System.out.println("\nDeposit successfully...");
                System.err.println("Your current balance: "+balance);
                check = false;
            }
            else {
                System.out.println("\nInsufficient balance");
                check=false;
            }

        }
            catch (Exception e){
                System.out.println("Invalid choice ");
                input.next();
            }
    }}

}


