//DESC:Notice how only the int primitive type has an increment operation bytecode (IINC), the others all require 4-5 bytecode instructions to load, add, and store the new value.

public class Increment
{
	public static void main(String args[])
	{
		byte b = 0;
		int i = 0;
		short s = 0;
		float f = 0;
		double d = 0;
		long l = 0;

		b++;
		i++;
		s++;
		f++;
		d++;
		l++;
	}
}