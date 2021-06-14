/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex27;

public class inputValidator {
    public String validateInput(String firstName, String lastName, String zip, String id){
        inputValidator myInput = new inputValidator();
        boolean firstNameLen = myInput.len(firstName);
        boolean lastNameLen = myInput.len(lastName);
        boolean firstNameFilled = myInput.filled(firstName);
        boolean lastNameFilled = myInput.filled(lastName);
        boolean employeeID = myInput.employeeIDFormat(id);
        boolean zipCode = myInput.zipCodeFormat(zip);
        String output = "";

        if(!firstNameLen)
            output += "The first name must be at least 2 characters long.\n";
        if(!lastNameLen)
            output += "The last name must be at least 2 characters long.\n";
        if(!firstNameFilled)
            output += "The first name must be filled in.\n";
        if(!lastNameFilled)
            output += "The last name must be filled in.\n";
        if(!employeeID)
            output += "The employee ID must be in the format of AA-1234.\n";
        if(!zipCode)
            output += "The zipcode must be a 5 digit number.";
        return output;
    }
    public boolean filled(String name){
        return name != "";
    }
    public boolean len(String name){
        return name.length() >= 2;
    }
    public boolean employeeIDFormat(String employeeID) {
        char[] id = employeeID.toCharArray();
        boolean size = employeeID.length() == 7;
        if(!size)
            return false;
        boolean letters = Character.isLetter(id[0]) && Character.isLetter(id[1]);
        boolean hyphen = id[2] == '-';
        boolean numbers = true;
        for (int i = 3; i < 7; i++) {
            if (!Character.isDigit(id[i]))
                numbers = false;
        }
        if (size && letters && hyphen && numbers)
            return true;
        else
            return false;
    }
    public boolean zipCodeFormat(String zipCode){
        char[] zip = zipCode.toCharArray();
        for (char n : zip) {
            if (!Character.isDigit(n))
                return false;
        }
        return true;
    }
}
