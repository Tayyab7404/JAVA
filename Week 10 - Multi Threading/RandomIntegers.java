// Week 10:

import java.util.Random;

class genInt
{
    int val = -1;

    synchronized void isEven()
    {
        if (val < 0)
        {
            System.out.println("Waiting for Generation of integer!");
            try
            {
                wait();
            }

            catch(Exception e){}
        }

        if (val % 2 == 0)
        {
            System.out.println("Square of " + val + " is: " + (val*val));
            val = -1;
        }
    }

    synchronized void isOdd()
    {
        if (val < 0){
            System.out.println("Waiting for Generation of integer: ");
            try
            {
                wait();
            }

            catch(Exception e){}
        }

        if (val % 2 == 1)
        {
            System.out.println("Cube of " + val + " is: " + (val*val*val));
            val = -1;
        }
    }

    synchronized void Generation()
    {
        Random r = new Random();
        val = r.nextInt(100);
        System.out.println("Generated integer: " + val);
        notifyAll();
    }
}

public class RandomIntegers 
{
    public static void main(String args[])
    {
        final genInt g = new genInt();

        new Thread()
        {
            public void run()
            {
                try
                {
                    for (int i = 1; i <= 10; i++)
                    {
                        g.Generation();
                        Thread.sleep(1000);
                    }
                }

                catch(InterruptedException e)
                {
                    System.out.println("Generation thread interrupted!");
                }

                System.out.println("Exiting Generation thread");
            }
        }.start();

        new Thread()
        {
            public void run()
            {
                try
                {
                    for (int i = 1; i <= 5; i++)
                    {
                        g.isEven();
                        Thread.sleep(500);
                    }
                }

                catch(InterruptedException e)
                {
                    System.out.println("isEven thread interrupted!");
                }

                System.out.println("Exiting isEven thread");
            }
        }.start();

        new Thread()
        {
            public void run()
            {
                try
                {
                    for (int i = 1; i <= 5; i++)
                    {
                        g.isOdd();
                        Thread.sleep(500);
                    }
                }

                catch(InterruptedException e)
                {
                    System.out.println("isOdd thread interrupted!");
                }
                
                System.out.println("Exiting isOdd thread");
            }
        }.start();
    }
}
