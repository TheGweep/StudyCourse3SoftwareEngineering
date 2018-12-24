import java.util.Scanner;

public class Menu
{
    static Scanner scn = new Scanner(System.in);
    static String class_name;
    final static String Warrior = "Warrior";
    final static String Witch = "Witch";
    final static String Magician = "Magician";
    static int x;
    static int attack = 0;
    static int defence = 0;
    static Warrior warrior = new Warrior();
    static Witch witch = new Witch();
    static Magician magician = new Magician();


    public static String Menu()
    {
        System.out.print("Введите класс персонажа : ");
        class_name = scn.nextLine();
        return class_name;
    }

    public static void Show_All_Menu()
    {
        Menu();
        while (!class_name.equals(Warrior) && !class_name.equals(Witch) && !class_name.equals(Magician))
        {
            System.out.println("Выбранного класса не существует...");
            System.out.println();
            Menu();
        }
        System.out.println("Ваш класс : " + class_name);
    }

    public static void EnterMenu()
    {
        System.out.println();
        System.out.println("1 - Атаковать");
        System.out.println("2 - Защищать");
        System.out.print("Ваш выбор : ");
        x = scn.nextInt();
        System.out.println();
    }

    public static void FightMenu()
    {
        do {
            EnterMenu();
            if (x == 1)
                System.out.println("Позиция атаки, атака + " + ++attack);
            else if (x == 2)
                System.out.println("Позиция защиты, защита + " + ++defence);
             else
            {
                System.out.println("Неверное число.");
                EnterMenu();
            }
                if (x == 1)
                    System.out.println("Позиция атаки, атака + " + ++attack);
                else if (x == 2)
                    System.out.println("Позиция защиты, защита + " + ++defence);
        } while (x != 1 && x != 2);

    }
}

