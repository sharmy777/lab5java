/**
 * Sharmilah M
 */

package src.com.lab5;

public class ThreadWithdrawal extends Thread
{
    Bank object;
    String name;
    double money;


    public ThreadWithdrawal (Bank object, String name, double money) 
    {
        this.object = object;
        this.name = name;
        this.money = money;

    }

    public void run() { Bank.withdrawn(name, money); }
    
}
