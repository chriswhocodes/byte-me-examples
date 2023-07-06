//DESC:Example of Java text blocks from <a href="https://openjdk.org/jeps/378">JEP 378</a>
//SINCE:15
public class TextBlocks
{
    public static void main(String[] args)
    {
        String html = """
                <html>
                    <body>
                        <p>Hello, world</p>
                    </body>
                </html>
                """;

        System.out.println(html);
    }
}
