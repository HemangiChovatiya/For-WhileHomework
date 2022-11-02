import java.util.Scanner;

public class CountNumberOfAInString09
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter a string "); // Take input from the keyboard any string
        String s = scanner.nextLine(); // Read a string from the user

        int countLegnth = s.length(); // Total number of character in a string
        int countLength_afterRemove = s.replace("a", "").length(); // Total number of character after removing 'a' in a string
        int count = countLegnth - countLength_afterRemove; // Can find substaction of length of string and after removing 'a'


        for (int i = 0; i<=count; )
        {
            System.out.println("Number of a is : " + count ); // Print result
            break;

        }


    }
}
