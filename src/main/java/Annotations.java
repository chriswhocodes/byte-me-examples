//DESC:Demonstrates annotations

@interface MyAnnotation
{
    String value();
}

@MyAnnotation("on class")
public class Annotations
{
    @MyAnnotation("on method")
    public String toString()
    {
        return "Foo!";
    }
}