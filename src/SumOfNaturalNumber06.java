import java.util.Scanner;

public class SumOfNaturalNumber06
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter the number for sum "); // Take input from the keyboard any number
        int n = scanner.nextInt(); // Read an int n value from the user

        int sum = 0; // Declaring and intializing variables and this is local variable no one can access

        if(n>=1) // Natural number start with 1  and natural number is grater than 0
        {
            for (int i=1; i<=n; i++) // For loop
            {
                sum = sum + i;
            }
            System.out.println("sum of firs of " + n + " natural number is = " + sum); // Print the sum
        }
        else
        {
            System.out.println(n + " is not natural number"); // If enter value is not natural number
        }
    }
}
