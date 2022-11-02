import java.util.Scanner;

public class SumOfFirstAnsLastDigitNumbers14
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter a five digit number"); // Take input from the keyboard any number
        int number = scanner.nextInt(); // Read an int 5-digit number value from the user
        int lastDigit = number % 10; // Find the last digit we use % operator of the given number
        int firstDigit = number; // local variable

        while (firstDigit>=10) // while loop
        {
           firstDigit = firstDigit/10;
        }
        System.out.println("sum = " + (firstDigit+lastDigit) ); // Print result sum of first digit and last digit
    }
}
