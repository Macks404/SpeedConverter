import java.util.Scanner;

public class main {
    static double val;
    static boolean toMph;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the value you would like to convert?");
        val = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Would you like to convert to MPH? Y/N");
        String choice = scanner.nextLine();

        if(choice.equals("y") || choice.equals("Y"))
        {
            toMph = true;
        }
        else
        {
            toMph = false;
        }

        System.out.println(convert(val, toMph));
    }

    public static double convert(double current, boolean toMph)
    {
        if(toMph)
        {
            double result = current / 1.60934;
            return result;
        }
        else
        {
            double result = current * 1.60934;
            return result;
        }

    }
}
