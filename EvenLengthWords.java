package Assignments;

import java.util.Scanner;

public class EvenLengthWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Split the input string into words
        String[] words = inputString.split("\\s+");

        // Print words with even length
        System.out.println("Words with even length:");
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }

        scanner.close();
    }
}