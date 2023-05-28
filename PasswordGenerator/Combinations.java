package PasswordGenerator;

public class Combinations{
    public static final String capital_Letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String small_Letters = "abcdefghijklmnopqrstuvwxyz";
    public static final String numbers = "0123456789";
    public static final String symbols = "!@#$%^&*()-_=+\\/~?";

    private final StringBuilder combos;

    public Combinations(boolean uppercaseIncluded, boolean lowercaseIncluded, boolean numbersIncluded, boolean specialCharactersIncluded)
    {
        combos = new StringBuilder();

        if(uppercaseIncluded)
            combos.append(capital_Letters);
        if(lowercaseIncluded)
            combos.append(small_Letters);
        if(numbersIncluded)
            combos.append(numbers);
        if(specialCharactersIncluded)
            combos.append(symbols);
    }

    public  String getcombinations(){
        return combos.toString();
    }
}


