//DESC:Demonstrates the MethodInfo exceptions table
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Exceptions
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            throw new RuntimeException("Boo!");
        }
        catch (Throwable t)
        {
            t.printStackTrace();
        }

        byte[] data = Files.readAllBytes(Paths.get("/tmp/foo"));
    }
}