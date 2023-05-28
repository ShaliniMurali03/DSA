package PasswordGenerator;

import java.util.Scanner;

public class MainPasswordApp
{
    public static final Scanner inputConsole = new Scanner(System.in);
    public static void main(String[] args)
    {
        Generate generate = new Generate(inputConsole);
        generate.mainLoop();
        inputConsole.close();
    }
}
