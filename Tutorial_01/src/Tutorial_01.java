public class Tutorial_01
{
    // 1.Task
    public static int addition (int a, int b)
    {
        return a + b;
    }

    // 2.Task
    public  static int division (int a, int b)
    {
        if (b == 0)
        {
            System.out.println("division by zero is not possible");
            return 0;
        }
        else
        {
            return a/b;
        }
    }

    // 3.Task
    public  static int remainder (int a, int b)
    {
        return b == 0 ? exception() : a % b;
    }
    public  static int exception ()
    {
        System.out.println("division by zero is not possible");
        return 0;
    }

    public static void main(String[] args)
    {
        System.out.println(addition(5, 6));
        System.out.println(division(25, 5));
        System.out.println(remainder(25 ,0));

    }
}
