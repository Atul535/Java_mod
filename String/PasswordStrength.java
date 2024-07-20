package String;

import java.util.Scanner;

public class PasswordStrength {
    public static void main(String[] args) {

        System.out.println("Enter Password to validate");
        Scanner sc = new Scanner(System.in);
        String myPass = sc.nextLine();

        int upperCase = 0, lowerCase = 0, numeric = 0, specialChar = 0;


        for (char c: myPass.toCharArray()) {
            if(Character.isUpperCase(c)){
                upperCase++;
            } 
            else if (Character.isLowerCase(c)) {
                lowerCase++;
            } 
            else if (Character.isDigit(c)) {
                numeric++;
            }
            else{
                specialChar++;
            }
        }

        if (myPass.length() > 7 && upperCase > 0 && lowerCase > 0 
        		&& numeric > 0 && specialChar > 0) {
                System.out.println("Strong Password");
        }
        else{
            System.out.println("Weak One");
        }


    }
}
