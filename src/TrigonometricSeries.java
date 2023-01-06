package Lab3;

import java.util.Scanner;

public class TrigonometricSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numTerms = sc.nextInt();
        double x1 = (double) Math.PI / 4;
        System.out.println(sin(x1, numTerms));
        System.out.println(cos(x1, numTerms));
    }

    public static double sin(double x, int numTerms) {
        double sinX = 0;
        int factorial = 1;
        for (int i = 1; i <= numTerms; i++) {
            factorial = factorial * i;
            if (i % 4 == 1) {
                sinX = sinX + (double) (Math.pow(x, i) / factorial);
            } else if (i % 4 == 3) {
                sinX = sinX - (double) (Math.pow(x, i) / factorial);
            }
        }
        return sinX;
    }

    public static double cos(double x, int numTerms) {
        double cosX = 1;
        int factorial = 1;
        for (int i = 1; i <= numTerms; i++) {
            factorial = factorial * i;
            if (i % 4 == 0) {
                cosX = cosX + (double) (Math.pow(x, i) / factorial);
            } else if (i % 4 == 2) {
                cosX = cosX - (double) (Math.pow(x, i) / factorial);
            }
        }
        return cosX;
    }
}
