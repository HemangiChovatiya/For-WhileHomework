import java.util.Scanner;

public class SumOfEachDigitNumbers10
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter a five digit number"); // Take input from the keyboard any number
        int number = scanner.nextInt(); // Read an int 5-digit number value from the user

        int digit; // Declare Local variable as a last digit
        int sum = 0; // Declaring and intializing variables and this is local variable no one can access

        while(number>0) // while loop
        {
            digit = number%10; // Find the last digit og the given number
            sum = sum+digit; // Add last digit to the variable sum
            number = number/10; // removes the last digit from number
        }
        System.out.println(sum);
    }
}
