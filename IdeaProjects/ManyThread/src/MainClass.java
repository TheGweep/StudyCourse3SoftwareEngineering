import java.util.*;

class ID implements Runnable {
    static Scanner scn = new Scanner(System.in);
    static int idclient;
    static String login;
    static String password;
    static int p = 0;

    public static void EnterId()
    {
        System.out.println();
        System.out.print("Введите id клиента : ");
        idclient = scn.nextInt();
    }

    public static void EnterLogin()
    {
        System.out.print("Введите логин : ");
        login = scn.next();
    }

    public static void EnterPassword()
    {
        System.out.print("Введите пароль : ");
        password = scn.next();
    }

    public static void ShowInfo()
    {
        System.out.println("Ваш id : " + idclient);
        System.out.println("Ваш логин : " + login);
        System.out.println("Ваш пароль : " + password);
        System.out.println("Общее кол-во пользователей : " + p);
    }

    public static void ShowMenu()
    {
        System.out.println("1 - Введите нового пользователя.");
        System.out.println("2 - Посмотреть информацию о текущем пользователе.");
        System.out.println("3 - Начать работу с пользователемю.");
        System.out.println("4 - Завершить работу программы ползователей.");
    }

    public static void All()
    {
        int n;
        int k;
        System.out.println("1 - Введите нового пользователя.");
        System.out.println("2 - Завершить ввод ползователей.");
        System.out.println();
        System.out.print("Ваш выбор : ");
        n = scn.nextInt();
        while (n != 2)
        {
            if (n == 1)
            {
                EnterId();
                EnterLogin();
                EnterPassword();
                System.out.println();
                ShowMenu();
                System.out.println();
                System.out.print("Ваш выбор : ");
                k = scn.nextInt();
                p++;
                while(k != 4)
                {
                    if (k == 1) {
                        EnterId();
                        EnterLogin();
                        EnterPassword();
                        System.out.println();
                        ShowMenu();
                        System.out.println();
                        System.out.print("Ваш выбор : ");
                        k = scn.nextInt();
                        p++;
                    } else if (k == 2)
                    {
                        System.out.println();
                        ShowInfo();
                        System.out.println();
                        ShowMenu();
                        System.out.println();
                        System.out.print("Ваш выбор : ");
                        k = scn.nextInt();
                    } else if (k == 3)
                    {
                        System.out.println("Пользователь работает.");
                        System.out.println();
                        ShowMenu();
                        System.out.println();
                        System.out.print("Ваш выбор : ");
                        k = scn.nextInt();
                    }
                    else
                    {
                        System.out.println("Неправильно ввели число, попытайтесь ещё раз.");
                        System.out.print("Ваш выбор : ");
                        k = scn.nextInt();
                    }
                }
                n = 2;
            }
            else {
                System.out.println("Неправильно ввели число, попытайтесь ещё раз.");
                System.out.print("Ваш выбор : ");
                n = scn.nextInt();
            }
        }
    }

    String name;
    Thread t;
    ID(String treadname)
    {
        name = treadname;
        t = new Thread(this, name);
        System.out.println("Второстепенный поток : " + t);
        t.start();
    }

    public void run()
    {
        try
        {
            All();
            Thread.sleep(100);
        } catch(InterruptedException e)
        {
            System.out.println("Прерывание второстепенного потока.");
        }
        System.out.println();
        System.out.println("Завершение второстепенного потока.");
    }
}

public class MainClass
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        String name;
        System.out.print("Введите имя потока : ");
        name = scn.next();
        ID obj1 = new ID(name);
        System.out.println("Первый поток выполняется : " + obj1.t.isAlive());
        System.out.println();
        try
        {
            obj1.t.join();
        } catch (InterruptedException e)
        {
            System.out.println("Прерывание главного потока.");
        }
        System.out.println("Первый поток выполняется : " + obj1.t.isAlive());
        System.out.println();
        System.out.println("Завершение главного потока.");
    }
}
