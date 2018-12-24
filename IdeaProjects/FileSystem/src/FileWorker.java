import java.io.*;
import java.lang.String;
import java.util.Scanner;

public class FileWorker {


    public static void write(String fileName, String text) {
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                out.println(text);

            } finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String read(String fileName) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        File file = new File(fileName);

        exists(fileName);

        try {
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    //sb.append("\n");
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    private static void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getName());
        }
    }

    public static void update(String nameFile, String newText) throws FileNotFoundException {
        exists(nameFile);
        StringBuilder sb = new StringBuilder();
        String oldFile = read(nameFile);
        sb.append(oldFile);
        sb.append(newText);
        write(nameFile, sb.toString());
    }

    public static void delete(String nameFile) throws FileNotFoundException {
        exists(nameFile);
        new File(nameFile).delete();
    }

    public static void create_dir(String nameFile) {
        File file = new File(nameFile);
        file.mkdir();
        file.mkdirs();
    }

    public static void delete_dir(File file) {
        if (!file.exists())
            return;
        if (file.isDirectory()) {
            for (File f : file.listFiles())
                delete_dir(f);
            file.delete();
            System.out.println("Удаленный файл или папка : " + file.getAbsolutePath());
        }
    }

    public static void get_path(File file) {
        if (!file.exists())
            return;
        if (file.isDirectory()) {
            for (File f : file.listFiles())
                get_path(f);
            System.out.println("Каталог файла или папки : " + file.getAbsolutePath());
        }
    }
}
   /* public static String copy_file(String fileName) throws FileNotFoundException {

        Scanner scn = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        File file = new File(fileName);

        exists(fileName);

        try {
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    //sb.append("\n");
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String text;
        System.out.print("Введите текст для копирования");
        text = scn.nextLine();
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                out.println(text);

            } finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
}*/
