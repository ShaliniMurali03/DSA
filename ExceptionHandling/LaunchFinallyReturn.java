package ExceptionHandling;

class Demo
{
    void disp()
//            int disp()
    {
        try
        {
            System.out.println("Method started");
//            return 10; // Finally block will dominate return statement, so return statment will not run
            System.exit(0); // exit statment will dominate Finally block, so finally will not run
        }
        finally
        {
            System.out.println("Method ending");
        }
    }
}
public class LaunchFinallyReturn {

    public static void main(String[] args) {
        Demo d=new Demo();
        d.disp();
    }

}
