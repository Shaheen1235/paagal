
package tw2;

/**
 *
 * @author User
 */
public class Bank {
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
