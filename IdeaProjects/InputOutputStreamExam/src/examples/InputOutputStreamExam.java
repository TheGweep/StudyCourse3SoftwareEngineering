package examples;
import java.io.*;
public class InputOutputStreamExam
{
    private InputStream inputStream;
    private OutputStream outputStream;
    private String path;

    public InputOutputStreamExam(String path)

    {
        this.path = path;
    }
    public void read() throws IOException
    {
        inputStream = new FileInputStream(path);
        int data = inputStream.read();
        char content;
        while(data != -1)
        {
            content = (char) data;
            System.out.print(content);
            data = inputStream.read();
        }
        inputStream.close();
    }
    public void write(String st) throws IOException
    {
        outputStream = new FileOutputStream(path);
        outputStream.write(st.getBytes());
        outputStream.close();
    }
}
