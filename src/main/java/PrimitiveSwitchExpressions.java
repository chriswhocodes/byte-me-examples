//SINCE:23
//DESC:Demonstrates switch expressions on primitives <a href="https://openjdk.org/jeps/455">JEP 455</a>
public class PrimitiveSwitchExpressions
{
    public static void main(String[] args)
    {
        boolean b = true;

        String response = switch (b)
        {
            case true -> "yes";
            case false -> "no";
        };

        System.out.println(response);
    }
}
