package ConsolePackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;


public class ConsoleClass extends JFrame {


    String str, str_2, str_3;
    JTextField textField;
    JTextArea textArea;
    JScrollPane scroll;
    List e_hand = new List();

    public ConsoleClass() {
        setTitle("cmd.exe");
        setLocation(700, 400);
        setSize(375, 400);
        setLayout(new BorderLayout());
        textArea = new JTextArea(20, 30);
        textField = new JTextField(30);
        scroll = new JScrollPane(textArea);
        add(scroll, BorderLayout.CENTER);
        add(textField, BorderLayout.NORTH);
        textArea.setLineWrap(true);
        textField.addActionListener(e_hand);
    }

    class List implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == textField) {
                str_2 = textField.getText();
                str = textArea.getText();
                str = str + SearchWord(textField.getText()) + "\n";
                textArea.setText(str);
                textField.setText("");
            }
        }
        public String SearchWord(String input)
        {
            if(input.equals("-help"))
            {
                return AllCommand();
            }

            return input + "\n" + NoFound();
        }
        public String AllCommand()
        {
            String s = "All command : " + "\n" + "-user" + "\n" + "-login" + "\n" + "-password";
            textArea.setText(s);
            return s;
        }
        public String NoFound()
        {
            String s1 = "Command not found";
            textArea.setText(s1);
            return s1;
        }
    }
}






