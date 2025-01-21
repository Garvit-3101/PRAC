// package Day5;

import java.util.Scanner;

class BankAccount {
    private double balance = 1000000;
    private int accountNumber = 12345678;
    private String accountHolder = "Anonymous";
    static int transactions = 0;

    void deposit(double amount){
        balance += amount;
        transactions++;
    }

    void withdraw(double amount) { 
        if (amount > balance){
            System.out.println("Not Enough Balance.");
        }
        balance -= amount;
        transactions++;
    }
    double checkBalance(){
        return balance;
    }
}

public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount ba = new BankAccount();
        System.out.println("Available balance : " + ba.checkBalance());
        sc.close();
    }
}
