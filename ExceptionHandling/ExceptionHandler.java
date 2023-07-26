package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandler
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        int a , b, res;
        System.out.println("Connection Established");
        try
        {
        System.out.println("Enter the Num1");
        a = scan.nextInt();
        System.out.println("Enter the Num2");
        b = scan.nextInt();
            try
            {
                res = a/b;
                System.out.println("Divided Result: "+ res);
                System.out.println("Connection Terminated");
            }
            catch (ArithmeticException ae){
                System.out.println("oh ho! Divide by zero is not allowed");
                System.out.println("Connection Terminated ");
            }
        }
        catch (InputMismatchException ime)
        {
            System.out.println("Oops! I accept only Integer user Input");
        }
    }
}
