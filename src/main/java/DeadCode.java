//DESC:Illustrates dead code elimination for static final guards
public class DeadCode {
    public static final boolean DEBUG = false;

    public static void main(String[] args) {
        if (DEBUG) {
            System.out.println("Hello World");
        }
    }
}