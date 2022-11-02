import java.util.Scanner;

public class FactorialNumber05
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter factorial number "); // Take input from the keyboard any number
        int n = scanner.nextInt(); // Read an int n value from the user

        int factorial = 1; // Declaring and intializing variables and this is local variable on one can access

        for (int i=n; i>0; i--) // for loop and factorial logic is [n=n*(n-1)*(n-2)*....*3*2*1]
        {
            factorial = factorial*i;
        }
        System.out.println("Factorial of " + n + " is : " + factorial); // Printing the result

    }
}
