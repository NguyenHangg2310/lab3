public class FibonacciInt {
    public static void main(String[] args) {
        printFibonacciInt();
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE + 1);
    }

    public static void printFibonacciInt() {
        int f0 = 1;
        int f1 = 1;
        int fn = 0;
        int i = 1;
        System.out.println("F(0) = 1");
        System.out.println("F(1) = 1");
        while (true) {
            i++;
            fn = f0 + f1;
            if (Integer.MAX_VALUE - f0 > f1) {
                System.out.println("F(" + i + ") = " + fn);
            } else {
                System.out.println("F(" + i + ") is out of the range of int");
                break;
            }
            f0 = f1;
            f1 = fn;
        }
    }
}
