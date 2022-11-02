import java.util.Scanner;

public class PrimeNumberCheck03 
{
    static int n;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = scanner.nextInt();


        if (x > 1 && n>1)
        {
          for (int i=2; i<x; i++);
            {
                if (x % n == 0)
                {
                    System.out.println(x + " is a not prime number");
                } else
                {
                    System.out.println(x + " is a prime number");
                }
            }

        }

    }   
    
}
