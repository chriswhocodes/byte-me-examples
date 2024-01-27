//SINCE:22
//DESC:Demonstrates statements before superclass constructor call <a href="https://openjdk.org/jeps/447">JEP 447</a>
public class StatementsBeforeSuper
{
   public StatementsBeforeSuper(int input)
   {
       System.out.println("Received " + input);

       if (input > 100)
       {
           throw new IllegalArgumentException("Too big!");
       }

       super();
   }
}