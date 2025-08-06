/**
 * Sharmilah M
 */

package src.com.lab5;

public class Bank 
{
    static double total;

    public Bank(double startingTotal) {
        Bank.total = startingTotal;
    }

    public static synchronized void withdrawn(String name, double withdrawal) 
    {
        if (withdrawal > total) {
            System.out.println(name + "your account balance is insufficient");
        } else {
            total -= withdrawal;
            System.out.println(name + "Withdrawl Success, New balance $" + total);
        }

    }

    public static synchronized void deposit (String name, double deposit) 
    {
    
        total += deposit;
        System.out.println(name + " Deposit successful. New balance $" + total);
    }

    public double returnTotal() 
    {
        return total;

    }
}
