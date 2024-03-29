//DESC:Demonstrates switch expressions introduced by <a href="https://openjdk.org/jeps/361">JEP 361</a>
//SINCE:14
public class SwitchExpressions
{
    public static void main(String[] args) {
        new SwitchExpressions();
    }

    public SwitchExpressions() {
        lookupSwitch(1);

        tableSwitch(1);

        switchExpression(1);
    }

    // sparse case values result in a lookupswitch
    private void lookupSwitch(int i) {
        switch (i) {
            case 1 -> System.out.println("first case");
            case 1_000 -> System.out.println("second case");
            case 1_000_000 -> System.out.println("third case");
        }
    }

    // tightly packed case values result in a tableswitch
    private void tableSwitch(int i) {
        switch (i) {
            case 1 -> System.out.println("first case");
            case 2 -> System.out.println("second case");
            case 3 -> System.out.printf("third case");
        }
    }

    private void switchExpression(int i) {
        String result = switch (i) {
            case 1 -> "first case";
            case 2 -> "second case";
            default -> "third case";
        };

        System.out.println(result);
    }
}