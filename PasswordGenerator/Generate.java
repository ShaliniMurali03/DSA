package PasswordGenerator;

import java.util.Scanner;

public class Generate
{
    Combinations combinations;//HAS-A Relationship
    public static Scanner inputConsole;

    public Generate(Scanner scanner){
        inputConsole = scanner;
    }

    public Generate(boolean IncludeUpper, boolean IncludeLower, boolean IncludeNum, boolean IncludeSym) {
        //invoking combination constructor
        combinations = new Combinations(IncludeUpper, IncludeLower, IncludeNum, IncludeSym);
    }

    private void printMenu() {
        System.out.println();
        System.out.println("Enter 1 - Password Generator");
        System.out.println("Enter 2 - Password Strength Check");
        System.out.println("Enter 3 - Useful Information");
        System.out.println("Enter 4 - Quit");
        System.out.print("Choice:");
    }

    private void requestPasswordInfo(){
        //default value set
        boolean IncludeUpper = false;
        boolean IncludeLower = false;
        boolean IncludeNum = false;
        boolean Includesym = false;

        boolean correctParams;

        System.out.println();
        System.out.println("Hey Hi!");
        System.out.println("Welcome to the password Generator, Answer the following questions by YES or NO \n");

        do{
            String input;
            correctParams = false;

            do{
                System.out.println("Do you want Lowercase letters \"abcd...\" to be used? ");
                input = inputConsole.next();
                PasswordRequestError(input);
            }while (!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no"));

            if(isInclude(input))
                IncludeLower = true;

            do{
                System.out.println("Do you want Uppercase letters \"ABCD...\" to be used? ");
                input = inputConsole.next();
                PasswordRequestError(input);
            }while (!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no"));

            if(isInclude(input))
                IncludeUpper = true;

            do{
                System.out.println("Do you want Number \"1234...\" to be used? ");
                input = inputConsole.next();
                PasswordRequestError(input);
            }while (!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no"));

            if(isInclude(input))
                IncludeNum = true;

            do{
                System.out.println("Do you want Symbols \"!@#$...\" to be used? ");
                input = inputConsole.next();
                PasswordRequestError(input);
            }while (!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no"));

            if(isInclude(input))
                Includesym = true;

            if(!IncludeUpper && !IncludeLower && !IncludeNum && !Includesym){
                System.out.println("you havent selected any input combinations required to generate your password, at least one of your answer should be Yes\n");
                correctParams = true;
            }
        }while(correctParams);

        System.out.println("Great! Now enter the length of the password");
        int length = inputConsole.nextInt();
        //calling Generate Constructor
        final Generate generator = new Generate(IncludeUpper, IncludeLower, IncludeNum, Includesym);
        final password pwd = generator.GeneratePassword(length);

        System.err.println("Your generated password -> " + pwd);
    }

    public void mainLoop(){
        System.out.println("Welcome to Secure Password Service");
        printMenu();

        String userOption = "-1";

        while(!userOption.equals("4")){
            userOption = inputConsole.next();

            switch (userOption){
                case "1" -> {
                    requestPasswordInfo();
                    printMenu();
                }
                case "2" -> {
                    checkPassword();
                    printMenu();
                }
                case "3" -> {
                    printUsefulInfo();
                    printMenu();
                }
                case "4" -> quitMessage();
                default -> {
                    System.out.println();
                    System.out.println("Kindly select one of the available commands");
                    printMenu();
                }
            }

        }


    }
    private void PasswordRequestError(String i)
    {
        if (!i.equalsIgnoreCase("yes") && !i.equalsIgnoreCase("no")) {
            System.out.println("You have entered something incorrect let's go over it again \n");
        }
    }
    private boolean isInclude(String Input)
    {
        if (Input.equalsIgnoreCase("yes")) {
            return true;
        }
        else {
            return false;
        }
    }
    //Main to generate Password
    private password GeneratePassword(int length) {
        final StringBuilder pass = new StringBuilder("");

        final int combinationLength = combinations.getcombinations().length();

        int max = combinationLength - 1;
        int min = 0;
        int range = max - min + 1;

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * range) + min;
            pass.append(combinations.getcombinations().charAt(index));
        }
        //invoking overridden string method from password class
        return new password(pass.toString());
    }
    private void checkPassword(){
        String input;
        System.out.println("Enter your password:");
        input = inputConsole.next();
        //invoking password class by creating an password object/constructor calling
        final password p = new password(input);
        System.out.println(p.calculateScore());
    }
    private void printUsefulInfo() {
        System.out.println();
        System.out.println("When you want to create a strong password, you should make sure you are taking all of the following into consideration:");
        System.out.println("Between eight and 64 characters, depending on the allowed length");
        System.out.println("Contain at least three, but preferably all, of the following:");
        System.out.println("Uppercase letter");
        System.out.println("Lowercase letter");
        System.out.println("Number");
        System.out.println("Special character (such as ?!,@),etc.,.");
        System.out.println("Not contain your name, common words, or easily identifiable personal information, such as your pet’s name or birthdate");
        System.out.println("Not be one of the previous passwords you used on this site or any other site");
        System.out.println("Not be a similar variation of a previous password (such as changing the password willow to the password willow!)");
    }
    private void quitMessage(){
        System.out.println("Don't Forget your password , Bye! until next time :)");
    }

}
