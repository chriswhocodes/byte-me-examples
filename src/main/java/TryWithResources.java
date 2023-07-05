//DESC:Demonstrates try-with-resources. Look for the invokevirtual call to close() on both the success and exception paths.
//SINCE:7
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources
{
    public static void main(String[] args)
    {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/tmp/TryWithResources.tmp")))
        {
            bufferedWriter.write("Hello World");
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
        finally
        {
            System.out.println("Did it work?");
        }
    }
}