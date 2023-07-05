//DESC:Example of the var keyword for type inference from <a href="https://openjdk.org/jeps/286">JEP 286</a>
//SINCE:10

import java.util.HashMap;
import java.util.Map;
public class VarKeyword
{
    public static void main(String[] args)
    {
        Map<String, Integer> typed = new HashMap<>();

        var implicit = new HashMap<String, Integer>();

        typed.put("key1", 100);

        implicit.put("key2", 200);

        count(typed);

        count(implicit);
    }

    private static void count(Map<String, Integer> map)
    {
        System.out.println(map.size());
    }
}