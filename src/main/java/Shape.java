//DESC:Example of a Java interface with single implementation
public interface Shape
{
	int getSides();
}

class Square implements Shape
{
	@Override
	public int getSides()
	{
		return 4;
	}
}
