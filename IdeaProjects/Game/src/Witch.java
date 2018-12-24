public class Witch
{

    static float hp_Witch = 110.0f;
    static float mp_Witch = 90.0f;
    static float cp_Witch = 100.0f;
    static float xp_Witch = 0.0f;
    static int lvl = 0;

    public static boolean Level_0_Witch()
    {
        hp_Witch = 110.0f;
        mp_Witch = 90.0f;
        cp_Witch = 100.0f;
        xp_Witch = 0.0f;
        return true;
    }

    public static boolean Level_1_Witch()
    {
        hp_Witch = 115.0f;
        mp_Witch = 95.0f;
        cp_Witch = 105.0f;
        xp_Witch = 100.0f;
        return true;
    }

    public static void Show_Witch()
    {
        System.out.println("Класс Witch : " + lvl);
        System.out.println("HP : " + hp_Witch);
        System.out.println("MP : " + mp_Witch);
        System.out.println("CP : " + cp_Witch);
        System.out.println("Опыт : " +  xp_Witch);
        System.out.println();
    }

    public static void All_Show_Witch()
    {
        Level_0_Witch();
        Show_Witch();
       // Level_1_Witch();
       // Show_Witch();
    }
}
