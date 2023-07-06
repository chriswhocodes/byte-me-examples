//SINCE:21
//DESC:Demonstrates StringTemplate feature from  <a href="https://openjdk.org/jeps/430">JEP 430</a>
public class StringTemplate
{
    public static void main(String[] args)
    {
        String name = "Chris";
        String namedMessage = STR."My name is \\{name}";
        System.out.println(namedMessage);
    }
}
