
public class Tutorial_01
{
    // 1.Task
    public static int addition (int a, int b)
    {
        return a + b;
    }

    // 2.Task
    public static int division (int a, int b)
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

    /*public static int maradek(int a, int b) {
    	return b == 0 ? Integer.MAX_VALUE : a % b;
    }*/

    public static int remainder (int a, int b)
    {
        return b == 0 ? exception() : a % b;
    }
    public static int exception ()
    {
        System.out.println("division by zero is not possible");
        return 0;
    }

    // 4.Task
    public static String months (int a)
    {
        switch (a)
        {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "There is no such month";
        }

    }

    // 5.Task
    public static void numbers (int a)
    {
        for (int i = 1; i <= a; i++ )
        {
            System.out.println(i);
        }
        System.out.println();
    }


}
