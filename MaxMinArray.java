package Assignments;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] scores = {105, 59, 73, 185, 95, 41, 90, 61, 68, 71};
        
        System.out.println("Scores are: ");
        displayScores(scores);

        
        int maxScore = findMaxScore(scores);
        System.out.println("\nMaximum Score: " + maxScore);

        int minScore = findMinScore(scores);
        System.out.println("Minimum Score: " + minScore);
    }

      static void displayScores(int[] scores) {
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
    }

      static int findMaxScore(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

      static int findMinScore(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
