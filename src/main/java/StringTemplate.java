//SINCE:21
//DESC:Demonstrates StringTemplate feature
public class StringTemplate
{
    public static void main(String[] args)
    {
        String name = "Chris";
        String namedMessage = STR. "My name is \\{name}";
        System.out.println(namedMessage);
    }
}
