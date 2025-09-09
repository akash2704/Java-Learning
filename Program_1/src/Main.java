import java.util.Scanner;

class BankAccount{
    String name;
    double balance;
    // contructor
    BankAccount(String name, double balance){
        this.name=name;
        this.balance=balance;
    }
    void deposit(double amount){
        balance+=amount;
        System.out.println("Deposited: "+ amount);
    }
    void withdraw(double amount){
        if (amount <=balance){
            balance-= amount;
            System.out.println("Withdraw: "+ amount);
        }else {
            System.out.println("Not enough Balance");
        }
    }
    void display(){
        System.out.println("Account Holder: "+ name);
        System.out.println("Balance: "+ balance);
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // create account
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(name, balance);

        // menu
        while (true) {
            System.out.println("\n1. Deposit  2. Withdraw  3. Display  4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    account.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    account.withdraw(sc.nextDouble());
                    break;
                case 3:
                    account.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}