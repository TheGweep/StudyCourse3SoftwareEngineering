public class Magician
{
    static float hp_Magician = 110.0f;
    static float mp_Magician = 120.0f;
    static float cp_Magician = 90.0f;
    static int lvl = 0;
    static float xp_Magician;

    public static boolean Level_0_Magician()
    {
        hp_Magician = 110.0f;
        mp_Magician = 120.0f;
        cp_Magician = 90.0f;
        xp_Magician = 0.0f;
        return true;
    }

    public static void Level_1_Magician()
    {
        hp_Magician = 115.0f;
        mp_Magician = 125.0f;
        cp_Magician = 95.0f;
        xp_Magician = 100.0f;
    }

    public static void Show_Magician()
    {
        System.out.println("Класс Magician : " + lvl);
        System.out.println("HP : " + hp_Magician);
        System.out.println("MP : " + mp_Magician);
        System.out.println("CP : " + cp_Magician);
        System.out.println("Опыт : " +  xp_Magician);
        System.out.println();
    }

    public static void All_Show_Magician()
    {
        Level_0_Magician();
        Show_Magician();
        //Level_1_Magician();
        //Show_Magician();
    }
}
