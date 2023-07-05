//DESC:Explore the bytecode between different kinds of Java loop

public class Loopy
{
	private static final int LIMIT = 100;

	public static void main(String args[])
	{
		new Loopy();
	}

	public Loopy()
	{
		forLoop();

		whileLoop();

		doWhileLoop();
	}

	private void forLoop()
	{
		for (int i = 0; i < LIMIT; i++)
		{
			System.out.println(i);
		}
	}

	private void whileLoop()
	{
		int i = 0;

		while (i++ < LIMIT)
		{
			System.out.println(i);
		}
	}

	private void doWhileLoop()
	{
		int i = 0;

		do
		{
			System.out.println(i);
		} while (i++ < LIMIT);
	}
}