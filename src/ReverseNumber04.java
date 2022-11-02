import java.util.Scanner;

public class ReverseNumber04
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five digit number");
        int a = scanner.nextInt();

        int reverse = 0;


        for (; a!=0; a/=10)
        {
            int digit = a%10;
            reverse = reverse * 10 + digit;
        }
        System.out.println("Reverse number is " + reverse);
    }
}
