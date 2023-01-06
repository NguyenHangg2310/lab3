package Lab3;

import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inNumber = 50;
        int count = 1;
        final int SECRET_NUMBER = (int) (Math.random() * 100);
        System.out.println(SECRET_NUMBER);
        while (inNumber != SECRET_NUMBER) {
            if (inNumber > SECRET_NUMBER) {
                System.out.println("Try lower");
            } else if (inNumber < SECRET_NUMBER) {
                System.out.println("Try higher");
            }
            inNumber = sc.nextInt();
            count++;
        }
        System.out.println("You got it in " + count + " trials");
    }
}
