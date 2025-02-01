//Main.java
//Name : Karan Rekhan
//PRN : 23070126054
//Batch : 2023-2027
import java.util.* ;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        UserInput userInput = new UserInput(scan);
        Calculator calculator = new Calculator();

         while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Fibonacci\n6. Sum of Array\n7. Mean of Array\n8. Variance\n9. Standard Deviation\n10. Exit");
            int choice = scan.nextInt();
            
            if (choice == 10) {
                System.out.println("Exiting...");
                break;
            }
            
            userInput.handleOperation(choice, calculator);
        }
        
        scan.close();
    }
}
        
       
