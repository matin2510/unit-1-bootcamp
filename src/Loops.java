/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

    public static void main(String args[]) {


    }


    public static void printNumbersOneToTen() {

        int x = 1;
        while (x <= 10) {
            System.out.println(x++);

        }
    }

    public static void printNumbersOneToTen2() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

        }
    }

    public static void OneToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);

        }
    }

    public static void EvenNumberstoN(int n) {
        int x = 2;
        while (x <= n) {
            System.out.println(x);
            x += 2;


        }
    }

    public static void addNumbers() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void addNumbersToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;

        }
        System.out.println(sum);
    }

    public static void addOneToOneThousand() {
        addNumbersToN(1000);
    }

    public static void printString(int n, String s) {
        for (int i = 0; i <= n; i++) {
            System.out.println(s);
        }
        if (n < 0) {
            System.out.println("");
        }

    }

    public static void FibonacciNumbers() {
        int n;
        int a = 0;
        int b = 0;
        int c = 1;
        for (int i = 1; i <= 10; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(a + " ");

        }
    }


}
