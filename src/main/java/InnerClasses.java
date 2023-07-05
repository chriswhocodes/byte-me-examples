//DESC:Examples of inner classes
public class InnerClasses
{
    public InnerClasses()
    {
        System.out.println("Constructed outer class");
    }

    class InnerClass
    {
        public InnerClass()
        {
            System.out.println("Constructed inner class");
        }
    }

    static class InnerStatic
    {
        public InnerStatic()
        {
            System.out.println("Constructed static inner class");
        }
    }

}