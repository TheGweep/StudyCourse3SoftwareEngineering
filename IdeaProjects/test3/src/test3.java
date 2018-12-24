import java.util.*;

class User
{
    static Scanner scn = new Scanner(System.in);

    static String idclient;
    static String login;
    static String password;

    public static void EnterId()
    {
        System.out.println();
        System.out.print("Введите id клиента : ");
        idclient = scn.next();
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
        System.out.println("Ваш login : " + login);
        System.out.println("Ваш password : " + password);
    }
}

public class test3
{
    public static void Enter()
    {
        Scanner scn = new Scanner(System.in);
        int p;
        int i;
        System.out.print("Введите кол-во пользователей : ");
        p = scn.nextInt();
        User a[] = new User[p];

        for(i = 0; i < a.length; i++)
        {
            System.out.println();
            a[i] = new User();
            a[i].EnterId();
            a[i].EnterLogin();
            a[i].EnterPassword();
        }
        for(i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }

    }
    public static void main(String args[])
    {
        Enter();
    }
}
