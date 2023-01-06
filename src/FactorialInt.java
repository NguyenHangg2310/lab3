

public class FactorialInt {
    public static void main(String[] args) {
        printFactorial();
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE +1);
    }

    public static void printFactorial(){
        int i = 1;
        int fn = 1;
        while (true) {
            System.out.println("The factorial of " + i + " is " +fn);
            if (Integer.MAX_VALUE / fn < (i+1) ) {
                System.out.println("The factorial of " + (i+1) + " is out of range");
                break;
            }
            i++;
            fn *= i;
        }
    }
}
