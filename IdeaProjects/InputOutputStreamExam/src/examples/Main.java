package examples;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    private static final String path = "C:/Users/Anton/IdeaProjects/InputOutputStreamExam/src/examples/TGV.txt";
    private static InputOutputStreamExam streamExam;
    static String string;
    static Scanner scn = new Scanner(System.in);

    public static void main(String TheGeekVain[]) throws IOException
    {
        streamExam = new InputOutputStreamExam(path);
        System.out.print("Введите строку в файл : ");
        string = scn.next();
        System.out.print("Данные в вашем файле : ");
        streamExam.write(string);
        streamExam.read();
    }

}
