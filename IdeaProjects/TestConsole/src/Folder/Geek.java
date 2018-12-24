package Folder;

import javax.swing.JFrame;

public class Geek
{
    public static void main(String args[])
    {
        TestConsole sys = new TestConsole("Командная строка...");
        sys.setVisible(true);
        sys.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sys.setSize(300,200);
        sys.setResizable(false);
        sys.setLocationRelativeTo(null);
    }
}
