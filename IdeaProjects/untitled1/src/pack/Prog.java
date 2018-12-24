package pack;

import javax.swing.*;

public class Prog
{
    public static void main (String args[])
    {
        Test s = new Test("Командная консоль...");
        s.setVisible(true);
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        s.setSize(300,200);
        //s.setResizable(false);
        s.setLocationRelativeTo(null);
    }
}
