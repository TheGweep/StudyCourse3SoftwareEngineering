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


public class Users
{
    public static void main(String args[])
    {
        ID a = new ID();
        a.EnterId();
    }
}
