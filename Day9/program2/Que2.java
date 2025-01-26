package Day9.program2;

import java.util.Scanner;

interface Payment {
    double makePayment(double amount);
    double refundPayment(double amount);
}

class CreditCardPayment implements Payment{
    public double makePayment(double amount) {
        System.out.println("Payment made using Credit Card. ");
        return amount;
    }

    public double refundPayment(double amount) {
        System.out.println("Payment refunded to Credit Card.");
        return amount;
    }
}

class PaypalPayment implements Payment {
    public double makePayment(double amount) {
        System.out.println("Payment made using PayPal.");
        return amount;
    }

    public double refundPayment(double amount) {
        System.out.println("Payment refunded to PayPal.");
        return amount;
    }
}


public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to be paid:");
        double amount = sc.nextDouble();
        Payment payment = new CreditCardPayment();
        payment.makePayment(amount);
        payment.refundPayment(amount);
        payment = new PaypalPayment();
        payment.makePayment(amount);
        payment.refundPayment(amount);
        sc.close();
    }    
}
