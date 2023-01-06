

public class FactorialLong {
    public static void main(String[] args) {
        printFactorialLong();
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE + 1);
    }

    public static void printFactorialLong() {
        long i = 1;
        long fn = 1;
        while (true) {
            System.out.println("The factorial of " + i + " is " + fn);
            // Sử dụng fn * (n+1) > Long.MAX_VALUE sẽ bị tràn bộ nhớ
            if (Long.MAX_VALUE / fn < (i + 1)) {
                System.out.println("The factorial of " + (i + 1) + " is out of range");
                break;
            }
            i++;
            fn *= i;
        }
    }
}
