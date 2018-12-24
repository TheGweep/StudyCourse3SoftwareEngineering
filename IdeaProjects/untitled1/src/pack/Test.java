package pack;


import javax.swing.*;
import java.awt.*;

public class Test extends JFrame {
    JLabel label, label1, label2;
    JButton b;
    JTextField textField;
    String text;

    Test(String s) {
        super(s);
        setLayout(new FlowLayout());
        label = new JLabel("Командная строка : ");
        label1 = new JLabel("Для помощи введите -help");
        label2 = new JLabel("Команда -help работает");
        textField = new JTextField(10);
        add(label);
        add(textField);
        add(label1);
    }

}