//DESC:Shows how the class file captures generics information in the Signature attribute.
public class Generics
{
    public static <T extends java.lang.Object, U extends java.lang.Object> T[] copyOf(U[] param1, int param2, java.lang.Class<? extends T[]> param3)
    {
        return null;
    }

    public static <T extends java.lang.Comparable<? super T>> void sort(java.util.List<T> param1)
    {
    }
}