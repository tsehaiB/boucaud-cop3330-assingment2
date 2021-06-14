/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */

package ex25;

public class passwordStrength {
    public int passwordValidator(String password){
        int strength = 0;
        char[] charPass = password.toCharArray();
        boolean hasDigits = false;
        boolean moreThanEight = (password.length() > 8);
        boolean hasLetters = false;
        boolean hasSpecialCharacters = false;
        for(char a : charPass)
        {
            if(Character.isDigit(a))
                hasDigits = true;
            if(Character.isLetter(a))
                hasLetters = true;
            if(a == '!' || a == '?' || a == '@' || a == '#' || a == '$' || a == '%' || a == '^' ||
               a == '&' || a == '*' || a == '(' || a == ')' || a == '-' || a == '=' || a == '+' ||
               a == '_' || a == ',' || a == '.' || a == '>' || a == '<' || a == '}' || a == '{' || a == '~' || a == '`')
                hasSpecialCharacters = true;
        }
        if(hasLetters && hasDigits && hasSpecialCharacters && moreThanEight)
            return 4;
        else if(hasLetters && hasDigits && moreThanEight)
            return 3;
        else if(hasLetters)
            return 2;
        else
            return 1;
    }
}
