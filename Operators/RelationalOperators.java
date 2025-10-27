
/**
 * The class RelationalOperators contains methods to perform various operations like checking
 * positivity/negativity of a number, odd/even check, finding the greatest of three numbers, leap year
 * check, grade calculation based on marks, and categorizing based on age.
 */
import java.util.Scanner;

public class RelationalOperators {

    public static void main(String[] args) {
        // The line `try (Scanner sc = new Scanner(System.in)) {` is using a try-with-resources statement in Java.

        try (Scanner sc = new Scanner(System.in)) {
            // This part of the code is responsible for displaying a menu of operations to the user and
            // executing the corresponding operation based on the user's choice.
            boolean running = true;
            while (running) {
                System.out.println("\n1. Check if a number is +ve, -ve or zero");
                System.out.println("2. Check if a number is odd or even");
                System.out.println("3. Find the greatest of the three numbers");
                System.out.println("4. Check if a number is a leap year");
                System.out.println("5. Calculate grade based on marks");
                System.out.println("6. Categorize based on age");
                System.out.println("7. Exit");
                System.out.print("Enter the number for the required operation: ");

                int operation = sc.nextInt();

                switch (operation) {
                    case 1 ->
                        System.out.println("The number is " + checkPosNegZero(sc));
                    case 2 ->
                        System.out.println("The number is " + checkOddEven(sc));
                    case 3 ->
                        System.out.println(checkGreatest(sc));
                    case 4 ->
                        System.out.println(checkLeapYear(sc));
                    case 5 ->
                        System.out.println(checkGrade(sc));
                    case 6 ->
                        System.out.println(checkAge(sc));
                    case 7 -> {
                        System.out.println("Exiting program. Goodbye!");
                        running = false;
                    }
                    default ->
                        System.out.println("Invalid choice!");
                }
            }

        }
    }
// The method `checkPosNegZero` in the `RelationalOperators` class is used to determine whether a given
// number is positive, negative, or zero.

    public static String checkPosNegZero(Scanner input) {
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        if (num > 0) {
            return "Positive";
        } else if (num < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    /**
     * The function `checkOddEven` takes user input, checks if the number is odd
     * or even, and returns the result as a string.
     *
     * @param input Scanner input
     * @return The method `checkOddEven` returns a String indicating whether the
     * input number is "Even" or "Odd".
     */
    public static String checkOddEven(Scanner input) {
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        return (num % 2 == 0) ? "Even" : "Odd";
    }

    /**
     * The function `checkLeapYear` takes a year as input and determines if it
     * is a leap year or not.
     *
     * @param input Scanner input
     * @return The method `checkLeapYear` returns a `String` indicating whether
     * the input year is a leap year or not. If the year is a leap year, it
     * returns "Leap Year", otherwise it returns "Not a Leap Year".
     */
    public static String checkLeapYear(Scanner input) {
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return "Leap Year";
        }
        return "Not a Leap Year";
    }

    /**
     * The function `checkGrade` takes user input for marks and returns the
     * corresponding grade based on certain conditions.
     *
     * @param input Scanner input
     * @return The method `checkGrade` returns a String value representing the
     * grade based on the input marks. The possible return values are "A", "B",
     * "C", "D", or "F" depending on the range in which the input marks fall. If
     * the input marks are outside the range of 0 to 100, it returns "Invalid
     * Marks!".
     */
    public static String checkGrade(Scanner input) {
        System.out.print("Enter the marks: ");
        float marks = input.nextFloat();
        if (marks < 0 || marks > 100) {
            return "Invalid Marks!";
        }
        return (marks >= 90) ? "A"
                : (marks >= 75) ? "B"
                        : (marks >= 60) ? "C"
                                : (marks >= 30) ? "D"
                                        : "F";
    }

    /**
     * The function `checkAge` takes an input age from the user and returns a
     * corresponding age group category (Senior, Adult, Teen, or Child).
     *
     * @param input The `checkAge` method takes a `Scanner` object as input to
     * read the age entered by the user. The method then checks the age and
     * returns a corresponding category based on the age entered.
     * @return The method `checkAge` returns a String value based on the age
     * input provided by the user. The possible return values are "Senior" if
     * the age is 60 or above, "Adult" if the age is between 20 and 59, "Teen"
     * if the age is between 13 and 19, and "Child" if the age is 12 or below.
     */
    public static String checkAge(Scanner input) {
        System.out.print("Enter the age: ");
        int age = input.nextInt();
        if (age >= 60) {
            return "Senior";
        } else if (age >= 20) {
            return "Adult";
        } else if (age >= 13) {
            return "Teen";
        } else {
            return "Child";
        }
    }

    public static String checkGreatest(Scanner input) {
        System.out.print("Enter the first number: ");
        int first = input.nextInt();
        System.out.print("Enter the second number: ");
        int second = input.nextInt();
        System.out.print("Enter the third number: ");
        int third = input.nextInt();
        int greatest = (first >= second)
                ? (first >= third ? first : third)
                : (second >= third ? second : third);
        return "Greatest number is: " + greatest;
    }
}
