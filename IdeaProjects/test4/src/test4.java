
import java.util.*;

class ttt
{
    static Scanner scn = new Scanner(System.in);
    public static void show()
    {
        System.out.println("ХАХАХАХ!");
        int x = scn.nextInt();
        System.out.println(x);
    }

}

public class test4
{
    static Scanner scn = new Scanner(System.in);
    static int p;
    static int i;
    public static void main(String[] args)
    {
        System.out.print("Введите кол-во : ");
        p = scn.nextInt();
        ttt a[] = new ttt[p];

        for(i = 0; i < a.length; i++)
        {
            a[i] = new ttt();
            p++;
        }
        for(i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
            a[i].show();
        }

    }

}
