package Lab3;

import java.util.Scanner;
import java.util.Random;

public class WordGuess {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final String[] words = {"testing", "hello"};
        Random rand = new Random();
        String secretWord = words[rand.nextInt(words.length - 1)];
        boolean[] secretWordMatches = new boolean[secretWord.length()];
        runGame(secretWordMatches, secretWord);

    }

    public static String getTrialWithMatches(boolean[] secretWordMatches, String secretWord) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < secretWord.length(); i++) {
            str.append((secretWordMatches[i]) ? secretWord.charAt(i) : '_');
        }
        return str.toString();
    }

    public static void checkTrialWord(char ch, boolean[] secretWordMatches, String secretWord) {
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWordMatches[i]) {
                continue;
            }
            secretWordMatches[i] = secretWord.charAt(i) == ch;
        }
    }

    public static void runGame(boolean[] secretWordMatches, String secretWord) {
        int count = 0;
        while (true) {
            System.out.print("Key in one character or your guess word: ");
            String trialWord = (sc.hasNext() ? sc.next() : "");
            count++;

            if (trialWord.length() < 1) {
                continue;
            }

            if (trialWord.length() == 1) {
                checkTrialWord(trialWord.charAt(0), secretWordMatches, secretWord);
                trialWord = getTrialWithMatches(secretWordMatches, secretWord);
                System.out.printf("Trail %1$d: %2$s\n", count, trialWord);
            }

            if (trialWord.equals(secretWord)) {
                System.out.printf("Trail %d: Congratulation!\n", count);
                break;
            }
        }
        System.out.printf("You got it %d trials\n", count);
    }
}
