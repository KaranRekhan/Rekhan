//UserInput.java
import java.util.* ;

public class UserInput {
    private final Scanner scan;
    
    public UserInput(Scanner scan) {
        this.scan = scan;
    }

     public void handleOperation(int choice, Calculator calculator) {
        switch (choice) {
            case 1 -> {
                System.out.println("Enter two numbers:");
                double a = scan.nextDouble();
                double b = scan.nextDouble();
                System.out.println("Result: " + calculator.add(a, b));
            }
            case 2 -> {
                System.out.println("Enter two numbers:");
                double a = scan.nextDouble();
                double b = scan.nextDouble();
                System.out.println("Result: " + calculator.subtract(a, b));
            }
            case 3 -> {
                System.out.println("Enter two numbers:");
                double a = scan.nextDouble();
                double b = scan.nextDouble();
                System.out.println("Result: " + calculator.multiply(a, b));
            }
            case 4 -> {
                System.out.println("Enter two numbers:");
                double a = scan.nextDouble();
                double b = scan.nextDouble();
                System.out.println("Result: " + calculator.divide(a, b));
            }
            case 5 -> {
                System.out.println("Enter a number:");
                int n = scan.nextInt();
                System.out.println("Fibonacci: " + calculator.fibonacci(n));
            }
            case 6 -> {
                System.out.println("Enter array size:");
                int size = scan.nextInt();
                double[] arr = new double[size];
                System.out.println("Enter elements:");
                for (int i = 0; i < size; i++) {
                    arr[i] = scan.nextDouble();
                }
                System.out.println("Sum: " + calculator.sumArray(arr));
            }
            case 7 -> {
                System.out.println("Enter array size:");
                int size = scan.nextInt();
                double[] arr = new double[size];
                System.out.println("Enter elements:");
                for (int i = 0; i < size; i++) {
                    arr[i] = scan.nextDouble();
                }
                System.out.println("Mean: " + calculator.mean(arr));
            }
            case 8 -> {
                System.out.println("Enter array size:");
                int size = scan.nextInt();
                double[] arr = new double[size];
                System.out.println("Enter elements:");
                for (int i = 0; i < size; i++) {
                    arr[i] = scan.nextDouble();
                }
                System.out.println("Variance: " + calculator.variance(arr));
            }
            case 9 -> {
                System.out.println("Enter array size:");
                int size = scan.nextInt();
                double[] arr = new double[size];
                System.out.println("Enter elements:");
                for (int i = 0; i < size; i++) {
                    arr[i] = scan.nextDouble();
                }
                System.out.println("Standard Deviation: " + calculator.standardDeviation(arr));
            }
            default -> System.out.println("Invalid choice!");
        }
    }
}
