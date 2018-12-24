import java.util.*;

class User
{
    Scanner scn = new Scanner(System.in);
    String login;
    String password;
    String ex_login;
    String ex_password;
    int per;
    int MAX = 100;
    User a[] = new User[MAX];
    int i = 0;
    int numb = 0;
    int UserLength = 0;


    public void EnterUser()
    {
        System.out.print("Введите логин : ");
        this.login = scn.nextLine();
        System.out.print("Введите пароль : ");
        this.password = scn.nextLine();
    }

    public void Show()
    {
        System.out.println("Ваш логин : " + this.login);
        System.out.println("Ваш пароль : " + this.password);
    }

    public void AddUser()
    {
        a[i] = new User();
        System.out.println("Ваш id : " + (i + 1));
        a[i].EnterUser();
        i++;
        UserLength++;

    }
    public void DeleteUser()
    {
                while (numb > i) {
                            System.out.println("Пользователя с таким id не существует.");
                            System.out.print("Введите id ещё раз : ");
                            numb = scn.nextInt();
                }
                System.out.println("Пользователь удалён");
            a[UserLength] = a[i];
            a[UserLength] = a[UserLength--];
    }


    public void ShowUser()
    {
       System.out.println("Ваш id : " + i);
        System.out.println(a[UserLength - 1]);
        a[UserLength - 1].Show();

    }

    public void ShowAllUser()
    {
        for(i = 0; i < UserLength; i++)
        {
            System.out.println(a[i]);
            System.out.println("Ваш id : " + (i + 1));
            a[i].Show();
        }
    }

    public void Enter_Menu()
    {
        System.out.println("1 - Начать работу с пользователем.");
        System.out.println("2 - Выйти.");
        System.out.print("Ваш выбор : ");
        per = scn.nextInt();
    }


    public void Menu()
    {
        Enter_Menu();
        {
                if(per == 1)
                    System.out.println("Процесс выполняются...");
                else if(per == 2)
                System.out.println("Конец");
                else
                {
                    System.out.println("Неверное число, попробуйте ещё раз ... ");
                    Enter_Menu();
                }
        }
    }

    public  void SearchUserName()
    {
        int id = 1;
        System.out.print("Введите логин : ");
        ex_login = scn.nextLine();
        System.out.print("Введите пароль : ");
        ex_password = scn.nextLine();
       for(i = 0; i < UserLength; i++)
        {
            if (a[i].login.equals(ex_login) && a[i].password.equals(ex_password))
                {
                    System.out.println("Пользователь : " + id);
                    System.out.println("Доступ разрещен.");
                    System.out.println("Логин : " + a[i].login);
                    System.out.println("Пароль : " + a[i].password);
                    Menu();
                }
            id++;
        }
    }
}


class UserMenu
{
    Scanner scn = new Scanner(System.in);
    int x;
    int y;
    int z = 0;
    User user = new User();



    public void FirstMenu()
    {
        System.out.println("1 - Начать.");
        System.out.println("2 - Выход.");
        System.out.print("Ваш выбор : ");
    }

    public void SecondMenu()
    {
        System.out.println("1 - Создать.");
        System.out.println("2 - Посмотреть информацию о текущем пользователе.");
        System.out.println("3 - Посмотреть информацию обо всех пользователях.");
        System.out.println("4 - Посмотреть существует ли пользователь.");
        System.out.println("5 - Удалить последнего пользователя.");
        System.out.println("6 - Выход.");
        System.out.print("Ваш выбор : ");
    }

    public void NoUser() { System.out.println("Пользователей не создано."); }

    public void EnterAgain() { System.out.println("Неверное число, попробуйте ещё раз ... "); }

    public void TheEnd() { System.out.println("Конец."); }

    public void Menu()
    {
        FirstMenu();
            do
            {
                x = scn.nextInt();
                if (x == 1)
                {
                    SecondMenu();
                    do {
                        y = scn.nextInt();
                        if (y == 1) {
                            z = 1;
                            user.AddUser();
                            SecondMenu();
                        } else if (y == 2) {
                            if (z == 0) {
                                NoUser();
                                SecondMenu();
                            } else if (z == 1) {
                                user.ShowUser();
                                SecondMenu();
                            }
                        } else if (y == 3) {
                            if (z == 0) {
                                NoUser();
                                SecondMenu();
                            } else if (z != 0) {
                                user.ShowAllUser();
                                SecondMenu();
                            }
                        } else if (y == 4) {
                            if (z == 0) {
                                NoUser();
                                SecondMenu();
                            } else if (z == 1) {
                                user.SearchUserName();
                                SecondMenu();
                            }
                        } else if (y == 5)
                        {
                            if(z == 1)
                            {
                                user.DeleteUser();
                                SecondMenu();
                            }
                            else if(z == 0)
                            {
                                NoUser();
                                SecondMenu();
                            }
                        }
                        else if (y == 6)
                            x = 2;
                        else
                        {
                            EnterAgain();
                            SecondMenu();
                        }
                    } while(y == 1 || y == 2 || y == 3 || y == 4 || y == 5 || y != 6);
                } else if (x == 2)
                {
                    TheEnd();
                } else
                {
                    EnterAgain();
                    FirstMenu();
                }
            } while (x == 1 || x != 2);
    }
}

public class Project
{
    public static void main(String TheGeekVain[])
    {
        UserMenu sys = new UserMenu();
        sys.Menu();
    }
}
