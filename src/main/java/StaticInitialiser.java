import java.util.ArrayList;
import java.util.List;

//DESC:Demonstrstrates static initialisation code
public class StaticInitialiser
{
    private static List<String> list = new ArrayList<>();

    static
    {
        list.add("Chris");
        list.add("Who");
        list.add("Codes");
    }

    static
    {
        System.out.println(list.size());
    }
}
