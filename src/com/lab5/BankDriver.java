package src.com.lab5;
/**
 * Sharmilah M
 */

public class BankDriver 
{

    public static void main(String[] args){

        Bank obj = new Bank(500.00);

        //threads

        ThreadWithdrawal w1 = new ThreadWithdrawal(obj, "dummy", 100);
        ThreadWithdrawal w2 = new ThreadWithdrawal(obj, "dummy2", 100);
        ThreadWithdrawal w3 = new ThreadWithdrawal(obj, "dummy3", 100);
        ThreadWithdrawal w4 = new ThreadWithdrawal(obj, "dummy4", 100);


        ThreadDeposit d1 = new ThreadDeposit(obj, "dummy", 50);
        ThreadDeposit d2 = new ThreadDeposit(obj, "dummy2", 50);
        ThreadDeposit d3 = new ThreadDeposit(obj, "dummy3", 50);
        ThreadDeposit d4 = new ThreadDeposit(obj, "dummy4", 50);

        w1.start();
        w2.start();
        w3.start();
        w4.start();

        d1.start();
        d2.start();
        d3.start();
        d4.start();

        try { 

            w1.join();
            w2.join();
            w3.join();
            w4.join();

            d1.join();
            d2.join();
            d3.join();
            d4.join();

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Total balance $" + obj.returnTotal());

        
    }
    
}
