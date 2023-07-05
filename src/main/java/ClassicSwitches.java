//DESC:Demonstrates the classic tableswitch and lookupswitch bytecode

public class ClassicSwitches
{
	public static void main(String[] args)
	{
		new ClassicSwitches();
	}

	public ClassicSwitches()
	{
		lookupSwitch(2);

		tableSwitch(2);
	}

	// sparse case values result in a lookupswitch
	private void lookupSwitch(int i)
	{
		switch (i)
		{
		case 1:
			System.out.println("first case");
			break;
		case 1_000:
			System.out.println("second case");
			break;
		case 1_000_000:
			System.out.println("third case");
			break;
		}
	}

	// tightly packed case values result in a tableswitch
	private void tableSwitch(int i)
	{
		switch (i)
		{
		case 1:
			System.out.println("first case");
			break;
		case 2:
			System.out.println("second case");
			break;
		case 3:
			System.out.printf("third case");
			break;
		}
	}
}