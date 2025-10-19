
/**
 * The class SwapTwoVariables swaps the values of two variables entered by the user.
 */
import java.util.Scanner;

public class SwapTwoVariables {

    public static void main(String[] args) {
        System.out.println("Program to swap two variables");

        // The code provided here is using a try-with-resources statement in Java. This statement is used to
        // automatically close resources that are used within the try block, in this case, the Scanner object
        // `sc`.

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value for first variable: ");
            int var1 = sc.nextInt();
            System.out.print("Enter the value for second variable: ");
            int var2 = sc.nextInt();

            // The code `int temp = var1; var1 = var2; var2 = temp;` is swapping the values of the two variables
            // `var1` and `var2`.
            
            int temp = var1; 
            var1 = var2;
            var2 = temp;
            System.out.println("First variable's value: " + var1);
            System.out.println("Second variable's value: " + var2);
        }

    }
}
