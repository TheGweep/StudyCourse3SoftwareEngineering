import java.nio.Buffer;
import java.util.*;
import java.io.*;

class FileWorker
{
    static Scanner scn = new Scanner(System.in);

    public static void write(String fileName, String text)
    {
        File file = new File(fileName);
        try {
            if (!file.exists())
            {
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try
            {
                out.print(text);
            } finally
            {
                out.close();
            }
        } catch(IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static String read(String fileName) throws FileNotFoundException
    {
        StringBuilder sb = new StringBuilder();

        exists(fileName);

        try
        {
            BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
            try
            {
                String s;
                while ((s = in.readLine()) != null)
                {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally
            {
                in.close();
            }
        } catch (IOException e)
        {
          throw  new RuntimeException(e);
        }
        return sb.toString();
    }

    private static void exists(String fileName) throws FileNotFoundException
    {
        File file = new File(fileName);
        if(!file.exists())
        {
            throw new FileNotFoundException(file.getName());
        }
    }

    public static void show()
    {
        System.out.print("Введите  текст : ");
        String text = scn.next();
        System.out.print("Введите путь : ");
        String fileName = scn.next();
    }
}

public class WorkInFile
{
    private static String text = "This new text \nThis new text2\nThis new text3\n";
    private static String fileName = "C://blog/a.txt";

    public static void main(String[] args) throws FileNotFoundException
    {
        FileWorker.read("no_file.txt");
        String textFromFile = FileWorker.read(fileName);
        System.out.println(textFromFile);
        FileWorker.write(fileName, text);
    }
}
