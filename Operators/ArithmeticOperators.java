
import java.util.Scanner;

public class ArithmeticOperators {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("\n1. Arithmetic operations on two numbers");
            System.out.println("2. Addition of two floating-point numbers");
            System.out.println("3. Perimeter of a rectangle");
            System.out.println("4. Area of a triangle");
            System.out.println("5. Simple Interest");
            System.out.println("6. Compound Interest");
            System.out.println("7. Convert Fahrenheit to Celsius");
            System.out.print("Enter the number corresponding to the required operation: ");

            int operation = sc.nextInt();

            switch (operation) {
                case 1 ->
                    calc(sc);
                case 2 ->
                    System.out.println("Sum = " + floatingSum(sc));
                case 3 ->
                    System.out.println("Perimeter = " + rectanglePerimeter(sc));
                case 4 ->
                    System.out.println("Area = " + triangleArea(sc));
                case 5 ->
                    System.out.println("Simple Interest = " + simpleInterest(sc));
                case 6 ->
                    System.out.println("Compound Interest = " + compoundInterest(sc));
                case 7 ->
                    System.out.println("Temperature in Celsius = " + tempConvertor(sc));
                default ->
                    System.out.println("Invalid choice!");
            }

        }
    }

    public static void calc(Scanner input) {
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Division: " + ((double) num1 / num2));
            System.out.println("Modulus: " + (num1 % num2));
        } else {
            System.out.println("Cannot divide or mod by zero!");
        }
    }

    public static float floatingSum(Scanner input) {
        System.out.print("Enter two floating numbers: ");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        return num1 + num2;
    }

    public static int rectanglePerimeter(Scanner input) {
        System.out.print("Enter length and breadth: ");
        int length = input.nextInt();
        int breadth = input.nextInt();
        return 2 * (length + breadth);
    }

    public static float triangleArea(Scanner sc) {
        System.out.print("Enter height and base: ");
        float height = sc.nextFloat();
        float base = sc.nextFloat();
        return 0.5f * base * height;
    }

    public static double simpleInterest(Scanner sc) {
        System.out.print("Enter principal, rate, and time: ");
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        return (p * r * t) / 100;
    }

    public static double compoundInterest(Scanner sc) {
        System.out.print("Enter principal, rate, and time: ");
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        return p * Math.pow(1 + (r / 100), t) - p;
    }

    public static double tempConvertor(Scanner sc) {
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temp = sc.nextDouble();
        return (temp - 32) * (5.0 / 9);
    }
}
