//DESC:Compare the bytecode before and after Java 11. You will see the private method is called with invokespecial before Java 11 and invokevirtual in Java 11+ due to <a href="https://openjdk.org/jeps/181">JEP 181</a>

public class CallPrivateMethod
{
	public static void main(String args[])
	{
		new CallPrivateMethod();
	}

	public CallPrivateMethod()
	{
		callPrivate("hello");
	}

	private void callPrivate(String message)
	{
		System.out.println(message);
	}
}