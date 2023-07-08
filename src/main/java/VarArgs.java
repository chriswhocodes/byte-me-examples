//DESC:Example of varargs parameters
public class VarArgs
{
    public void onlyVarArgs(long... longs)
    {
        System.out.println(longs.length);
    }

    public void lastParamVarArgs(int i, long... longs)
    {
        System.out.println(i);
        System.out.println(longs.length);
    }

    public void referenceTypeVarArgs(String... strings)
    {
        System.out.println(strings.length);
    }

    public void arrayVarArgs(String[]... strings)
    {
        System.out.println(strings.length);
    }
}