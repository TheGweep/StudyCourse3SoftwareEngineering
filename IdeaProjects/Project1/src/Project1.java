class Thread2 implements Runnable
{
    Thread t;
    Thread2()
    {
        t = new Thread(this, "Thread 2");
        System.out.println("Thread 2: " + t);
        t.start();
    }
    public void run()
    {
        try
        {
            for (int i = 5; i > 0; i--)
            {
                System.out.println("Thread 2: " + i);
                Thread.sleep(500);
            }
        } catch(InterruptedException e)
        {
            System.out.println("Co-end Thread 2.");
        }
        System.out.println("End Thread 2.");
    }

}

class Project1
{
    public static void main(String args[])
    {
        new Thread2();
        try
        {
            for (int i = 5; i > 0; i--)
            {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e)
        {
            System.out.println("Co-end Main thread.");
        }
        System.out.println("End Main thread.");
    }

}