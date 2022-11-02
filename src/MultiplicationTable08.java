import java.util.Scanner;

public class MultiplicationTable08
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter a number of table"); // Take input from the keyboard any number
        int n = scanner.nextInt(); // Read an int n value from the user

        for(int i=1; i<=10; i++) // For loop and value of i is for table
        {
            System.out.println(n + " * " + i + " = " + (n*i)); // Answer of multiplication table
        }
    }
}
