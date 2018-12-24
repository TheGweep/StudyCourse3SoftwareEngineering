public class Main
{
    public static void main(String args[])
    {
        Warrior warrior = new Warrior();
        Witch witch = new Witch();
        Magician magician = new Magician();
        Menu menu = new Menu();
        warrior.All_Show_Warrior();
        System.out.println();
        witch.All_Show_Witch();
        System.out.println();
        magician.All_Show_Magician();
        System.out.println();
        menu.Show_All_Menu();
        menu.FightMenu();
    }
}
