import java.util.*;

class User
{
    static Scanner scn = new Scanner(System.in);

    String login;
    String password;
    int UserLength = 0;

    public void EnterLogin()
    {
        System.out.print("Введите логин : ");
        login = scn.next();
    }

    public void EnterPassword()
    {
        System.out.print("Введите пароль : ");
        password = scn.next();
    }

    public void ShowInfo()
    {
        System.out.println("Ваш login : " + login);
        System.out.println("Ваш password : " + password);
    }

    public void Show1()
    {
        System.out.println("1 - Начать.");
        System.out.println("2 - Выход.");
        System.out.print("Ваш выбор : ");
    }

    public void Show2()
    {
        System.out.println();
        System.out.println("1 - Создать.");
        System.out.println("2 - Посмотреть информацию обо всех пользователях.");
        System.out.println("3 - Выход.");
        System.out.print("Ваш выбор : ");
    }

    public void Show3()
    {
        System.out.println();
        System.out.println("1 - Создать.");
        System.out.println("2 - Посмотреть информацию обо всех пользователях.");
        System.out.println("3 - Выход.");
        System.out.print("Ваш выбор : ");
    }

    public void CountUsers()
    {
        System.out.print("Кол-во пользователей : ");
        System.out.println(UserLength);
    }


    public void Enter()
        {
            final int MAX = 100;
            int k;
            int c;
            User a[] = new User[MAX];
            Show1();
            k = scn.nextInt();
            while (k != 2) {

                if (k == 1)
                {
                    Show2();
                    c = scn.nextInt();
                    do {
                        if (c == 1)
                        {
                            a[UserLength] = new User();
                            a[UserLength].EnterLogin();
                            a[UserLength].EnterPassword();
                            UserLength++;
                            Show2();
                            c = scn.nextInt();
                            if (c == 1)
                            {
                                a[UserLength] = new User();
                                a[UserLength].EnterLogin();
                                a[UserLength].EnterPassword();
                                UserLength++;
                                Show2();
                            }
                        }
                            else if (c == 2)
                            {
                                System.out.println();
                                for (int i = 0; i < UserLength; i++)
                                {
                                    System.out.println();
                                    System.out.println(a[i]);
                                    a[i].ShowInfo();
                                }
                                System.out.println();
                                CountUsers();
                                Show2();
                                c = scn.nextInt();
                                if (c == 2)
                                {
                                    System.out.println();
                                    for (int i = 0; i < UserLength; i++)
                                    {
                                        System.out.println();
                                        System.out.println(a[i]);
                                        a[i].ShowInfo();
                                    }
                                    System.out.println();
                                    CountUsers();
                                    Show2();
                                }
                            }
                                if (c == 3)
                                {
                                    System.out.println("Конец.");
                                    k = 2;
                                } else
                                {
                                    System.out.println("Неверное число.");
                                    Show2();
                                    c = scn.nextInt();
                                    if (c == 3)
                                    {
                                        System.out.println("Конец.");
                                        k = 2;
                                    }
                                }
                            } while (c != 3) ;
                        } else
                {
                            System.out.println("Неверное число.");
                            Show1();
                            k = scn.nextInt();
                }
            }
    }
}

public class test2
{

    public static void main (String args[])
    {
        User d = new User();
        d.Enter();
    }
}
