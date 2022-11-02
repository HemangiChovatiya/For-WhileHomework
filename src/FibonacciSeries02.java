import java.util.Scanner;

public class FibonacciSeries02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter first number"); // Take input from the keyboard any number
        int a = scanner.nextInt(); // Read an int a value from the user
        System.out.println("Enter second number"); // Take input from the keyboard any number
        int b = scanner.nextInt(); // Read an int b value from the user
        System.out.println("Enter limitation number for fibonacci series");  // Take input from the keyboard any number
        int n = scanner.nextInt(); // Read an int n value from the user
        System.out.println("Fibonacci series is :"); // print this sentence

        for(int i =a; i<=n; i++) // for loop
        {
            System.out.print(a + " " ); // printing result
            int c = a+b; // adding two numbers a and b
            a = b; // Value of a become value of b
            b = c; //  Value of a become value of b
        }
    }
}
