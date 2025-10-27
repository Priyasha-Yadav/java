import java.util.Scanner;
public class Input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print(name + ", please enter your age now: ");
        int age = sc.nextInt();
        System.out.println("Welcome " + name+ ", you are " + age + " years old");
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.err.println("The resultant sum of the given two numbers is " + (num1+num2));

    }   
}