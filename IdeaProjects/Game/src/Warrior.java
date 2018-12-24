public class Warrior
{
    static float hp_Warrior = 120.0f;
    static float mp_Warrior = 70.0f;
    static float cp_Warrior = 110.0f;
    static float xp_Warrior = 0.0f;
    static int lvl = 0;

    public static boolean Level_0_Warrior()
    {
        hp_Warrior = 120.0f;
        mp_Warrior = 70.0f;
        cp_Warrior = 110.0f;
        xp_Warrior = 0.0f;
        return true;
    }

    public static boolean Level_1_Warrior()
    {
        hp_Warrior = 125.0f;
        mp_Warrior = 75.0f;
        cp_Warrior = 115.0f;
        xp_Warrior = 100.0f;
        return true;
    }

    public static void Show_Warrior()
    {
        System.out.println("Класс Warrior : " + lvl);
        System.out.println("HP : " + hp_Warrior);
        System.out.println("MP : " + mp_Warrior);
        System.out.println("CP : " + cp_Warrior);
        System.out.println("Опыт : " +  xp_Warrior);
        System.out.println();
    }

    public static void All_Show_Warrior()
    {
        Level_0_Warrior();
        Show_Warrior();
       // Level_1_Warrior();
       // Show_Warrior();
    }
}
