package Lab3;

public class TribonacciInt {
    public static void main(String[] args) {
        printTribonacciInt();
    }

    public static void printTribonacciInt() {
        int f0 = 1;
        int f1 = 1;
        int f2 = 2;
        int fn = 0;
        int i = 1;
        System.out.println("F(0) = 1");
        System.out.println("F(1) = 1");
        System.out.println("F(2) = 2");
        while (true) {
            i++;
            fn = f0 + f1 + f2;
            // Sử dụng f0 + f1 + f2 > Integer.MAX_VALUE sẽ bị tràn bộ nhớ nên thay thế bằng Integer.MAX_VALUE - f0 - f1 < f2
            if (Integer.MAX_VALUE - f0 - f1 > f2) {
                System.out.println("F(" + i + ") = " + fn);
            } else {
                System.out.println("F(" + i + ") is out of the range int");
                break;
            }
            f0 = f1;
            f1 = f2;
            f2 = fn;
        }
    }
}
