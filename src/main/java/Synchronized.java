//DESC:Demonstrates sychronized methods and blocks
public class Synchronized
{
	private long counter = 0;

	private Object lock = new Object();

	public synchronized void inc1()
	{
		counter++;
	}

	public void inc2()
	{
		System.out.println("stuff");

		synchronized (lock)
		{
			counter++;
		}

		System.out.println("more stuff");
	}
}