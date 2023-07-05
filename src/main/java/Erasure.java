//DESC:Demonstrates type erasure

import java.util.ArrayList;
import java.util.List;

public class Erasure
{
    public static void main(String[] args)
    {
        doTyped();

        doUntyped();
    }

    private static void doUntyped()
    {
        List untyped = new ArrayList();
        untyped.add("Hello untyped");

        for (Object obj : untyped)
        {
            System.out.println((String)obj);
        }
    }

    private static void doTyped()
    {
        List<String> typed = new ArrayList<>();
        typed.add("Hello typed");

        for (String str : typed)
        {
            System.out.println(str);
        }
    }
}