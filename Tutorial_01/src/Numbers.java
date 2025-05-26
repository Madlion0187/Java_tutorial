import java.util.Scanner;

public class Numbers
{


    public static void main(String[] args)
    {
        System.out.println("Press zero to exit");
        System.out.println("Add a number: ");
        Scanner user_input = new Scanner(System.in);
        int number;

        while ( (number = user_input.nextInt()) != 0)
        {
            System.out.println(number + " is your number");
        }
    }
}
