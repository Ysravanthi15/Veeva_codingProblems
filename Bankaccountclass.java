import java.util.Scanner;

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Transaction");
        } else {
            balance += amount;
            System.out.printf("%.2f%n", balance);
        }
    }

    void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Invalid Transaction");
        } else {
            balance -= amount;
            System.out.printf("%.2f%n", balance);
        }
    }
}

public class Bankaccountclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = sc.nextDouble();
        int q = sc.nextInt();

        BankAccount account = new BankAccount(balance);

        for (int i = 0; i < q; i++) {
            String operation = sc.next();
            double amount = sc.nextDouble();

            if (operation.equals("D")) {
                account.deposit(amount);
            } else if (operation.equals("W")) {
                account.withdraw(amount);
            }
        }
    }
}