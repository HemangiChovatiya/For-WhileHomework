import java.util.Scanner;

public class Range10NumberPrint01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter first number "); // Take input from the keyboard any number
        int a = scanner.nextInt(); // Read an int a value from the user
        System.out.println("Enter second number"); // Take input from the keyboard any number
        int b = scanner.nextInt(); // Read an int b value from the user
        System.out.println("Numbers between " + a + " - " + b); // print sentence

        for(int i=a; i<=b; i++) // for loop
        {
            System.out.println(i); // Printing the result
        }
    }
}
