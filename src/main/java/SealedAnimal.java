//DESC:Example of sealed classes from <a href="https://openjdk.org/jeps/409">JEP 409</a>
//SINCE:18
public abstract sealed class SealedAnimal permits Lion, Tiger, Bear
{
    abstract void speak();
}

final class Lion extends SealedAnimal
{
    public void speak()
    {
        System.out.println("Roar");
    }
}

final class Tiger extends SealedAnimal
{
    public void speak()
    {
        System.out.println("Also Roar");
    }
}

final class Bear extends SealedAnimal
{
    public void speak()
    {
        System.out.println("More of a Growl");
    }
}