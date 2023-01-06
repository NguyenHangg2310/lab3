package Lab3;

public class SpecialSeries {
    public static void main(String[] args) {
        System.out.println(specialSeries(1, 3));
    }

    public static double specialSeries(double x, int numTerms) {
        double sum = x;
        int factorialEven = 1;
        int factorialOdd = 1;
        for (int i = 1; i <= numTerms; i++) {
            if (i % 2 == 1) {
                factorialOdd = factorialOdd * i;
                factorialEven = factorialEven * (i + 1);
                sum += (double) factorialOdd / factorialEven * (Math.pow(x, (i + 2)) / (i + 2));
            }
        }
        return sum;
    }
}
