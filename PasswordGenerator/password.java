package PasswordGenerator;

public class password
{
    String inputValue;
    int Length;

    //Constructor
    public password(String s)
    {
        inputValue = s;
        Length = s.length();
    }
    //assigning value for the identity of each type
    public int CharType(char c){
        int value;

        //Char is UpperCase
        if((int) c >= 65 && (int)c <= 90)
            value = 1;
        //Char is LowerCase
        else if((int) c >= 97 && (int)c <= 122)
            value = 2;
        //Char is Number
        else if((int) c >= 60 && (int)c <= 71)
            value = 3;
        //Char is Symbol
        else
            value = 4;

        return value;
    }

    public int PasswordStrengh(){
        String s = this.inputValue;
        boolean usedUpper = false;
        boolean usedLower = false;
        boolean usedNum = false;
        boolean usedSym = false;

        int type;
        int Score = 0;

        for(int i = 0 ;i<s.length();i++){
            char c = s.charAt(i);
            type = CharType(c);//Invokes method to check the type of each char of the input

            if(type == 1)
                usedUpper = true;

            if(type == 2)
                usedLower = true;

            if(type == 3)
                usedNum = true;

            if(type == 4)
                usedSym = true;
        }
        //Score calculation
        if(usedUpper)
            Score +=25;
        if(usedLower)
            Score +=25;
        if(usedNum)
            Score +=25;
        if(usedSym)
            Score +=25;

        return Score;
    }
    public String calculateScore(){
        //to get the Score
        int Score = this.PasswordStrengh();

        //Display the strength of the password based on the score
        if(Score == 100)
            return "Great! Your password Strength is 100%";
        else if (Score >= 75)
            return "This is a good password :) Your password Strength is 75% , but you can still do better";
        else if (Score >= 50)
            return "This is a medium password :/ Your password Strength is 50%, try making it better";
        else
            return "This is a weak password :( Your password Strength is 25%, definitely find a new one";
    }

    @Override
    public String toString(){
        return inputValue;
    }


}
