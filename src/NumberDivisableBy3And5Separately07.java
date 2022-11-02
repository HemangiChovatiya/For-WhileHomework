import java.util.Scanner;

public class NumberDivisableBy3And5Separately07
{
    public static void main(String[] args)
    {
        System.out.println("Between 1 to 100 number divisible by 3 numders : "); // Print requirements
        for(int i=1; i<=100; i++) // For loop
        {
            if(i%3==0) // Condition if number is divisible by 3
            {
                System.out.print(i + " "); // Print answer
            }
        }
        System.out.println("\n"); // For new line
        System.out.println("Between 1 to 100 number divisible by 5 numders : "); // Print requirements
        for(int i=1; i<=100; i++) // For loop
        {
            if(i%5==0) // Condition if number is divisible by 5
            {
                System.out.print(i + " "); // Print answer
            }
        }

    }
}
