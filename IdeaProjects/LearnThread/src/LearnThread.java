import java.util.*;
class ID
{
    static Scanner  scn = new Scanner(System.in);
    static int idclient;
    static String login;
    static String password;


    public static void EnterLogin()
    {

        System.out.print("Введите логин : ");
        login = scn.next();
    }
    public static void EnterPassword()
    {
        System.out.print("Enter password : ");
        password = scn.next();
    }
    public static void ShowInfo()
    {
        System.out.println("Your id : " + idclient);
        System.out.println("Your login : " + login);
        System.out.println("Your password : " + password);
    }
    public static void EnterId()
    {
        System.out.print("Enter id user's : ");
        idclient = scn.nextInt();
        EnterLogin();
        EnterPassword();
        ShowInfo();
    }

}
class Thread1 implements Runnable
{
    String name;
    Thread t;
    Thread1(String threadname)
    {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New Thread: " + t);
        t.start();
    }
    public void run()
    {
        /*System.out.print("Enter count users : ");
        int count;
        Scanner scn = new Scanner(System.in);
        count = scn.nextInt();
        ID a = new ID();
        for(int i = 0; i < count; i++)
        {
            a.EnterId();
        }*/
        try
        {
            ID a = new ID();
            a.EnterId();
            Thread.sleep(1000);
        } catch (InterruptedException e)
        {
            System.out.println("Прерван");
        }
        System.out.println("Завершен");
    }
}


class LearnThread
{
    public static void main(String args[])
    {
        new Thread1("First");
        new Thread1("Second");
        try
        {
            Thread.sleep(10000);
        } catch(InterruptedException e)
        {
            System.out.println("Co-end main thread.");
        }
        System.out.println("End main thread.");
    }
}