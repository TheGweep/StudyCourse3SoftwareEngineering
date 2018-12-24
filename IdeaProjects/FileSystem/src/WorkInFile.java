import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WorkInFile
{
    private static String text;
    private static String fileName_dir;
    private static String fileName;
    static Scanner scn = new Scanner(System.in);
    public static void main(String args[]) throws FileNotFoundException
    {
        {
            System.out.print("Введите путь папки : ");
            fileName_dir = scn.nextLine();
            System.out.print("Введите файл в папке : ");
            FileWorker.create_dir(fileName_dir);
            fileName = scn.nextLine();
            fileName = fileName_dir + fileName;
            System.out.print("Введите данные в файл : ");
            text = scn.nextLine();
            FileWorker.write(fileName, text);
            String textFromFile = FileWorker.read(fileName);
            System.out.println(textFromFile);
            System.out.print("Введите (обновленные)данные в файл : ");
            text = scn.nextLine();
            FileWorker.update(fileName, text);
            String textFromFile_1 = FileWorker.read(fileName);
            System.out.println(textFromFile_1);
            FileWorker.get_path(new File(fileName));
            FileWorker.delete(fileName);
            FileWorker.delete_dir(new File(fileName));
        }
    }
}
