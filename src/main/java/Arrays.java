//DESC:Demonstrates array allocation in bytecode
public class Arrays
{

    public static final int[] emptyPrimitiveArray()
    {
        return new int[10];
    }

    public static final int[] primitiveArray()
    {
        return new int[]{2, 4, 6, 8, 10};
    }

    public static final String[] emptyObjectArray()
    {
        return new String[10];
    }

    public static final String[] objectArray()
    {
        return new String[]{"Chris", "Who", "Codes"};
    }
}