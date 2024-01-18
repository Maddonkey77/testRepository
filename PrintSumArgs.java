/**
 * Print the sum of two integers received
 * as command-line arguments.
 */
public class PrintSumArgs
{
    public static void main(String[] args)
    {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        int sum = num1 + num2 + num3;
        System.out.println("The sum is " + sum + ".");
    }
}


