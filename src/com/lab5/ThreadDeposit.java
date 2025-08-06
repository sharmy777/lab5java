package src.com.lab5;
/**
 * Sharmilah M
 */

public class ThreadDeposit extends Thread 
{

    Bank object;
    String name;
    double money;


    ThreadDeposit (Bank object, String name, double money) 
    {
        this.object = object;
        this.name = name;
        this.money = money;

    }

    @Override
    public void run() { Bank.deposit(name, money); }
    
}
