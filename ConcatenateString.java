package Assignments;

import java.util.Scanner;
public class ConcatenateString {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        String result = concatenateStrings(firstString, secondString);
        System.out.println("Concatenated String is: "  + result);

    }

     static String concatenateStrings(String firstString, String secondString) {
        return firstString.concat(secondString);
    }
}