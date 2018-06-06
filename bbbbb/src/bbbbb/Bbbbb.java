
package Bbbbb;

/**
 *
 * @author User
 */
public class Bbbbb {
     float balance;

    Bank(float amount) {
        balance = amount;
    }

    void deposit(float amount) {
        balance += amount;
    }

    void withdraw(float amount) {
        if (amount < 500) {
            System.out.println("Insufficient bal");
        } else {
            balance -= amount;
        }
    }

    void display() {
        System.out.println("Balance is:" + balance);
    }
}
