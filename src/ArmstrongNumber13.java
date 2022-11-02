import java.util.Scanner;

public class ArmstrongNumber13
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter a number"); // Take input from the keyboard any number
        int number = scanner.nextInt(); // Read an int number value from the user

        int a, n = 0, armStrong = 0, result;
        result = number;

        while(number>0)
        {
            a = number%10;
            armStrong = (n*a)+armStrong;
            number = number/10;
            a++;
        }
        if (result==armStrong)
        {
            System.out.println(result + " is Armstrong Number");
        }
        else
        {
            System.out.println(result + " is not Armstrong Number");
        }
    }
}
