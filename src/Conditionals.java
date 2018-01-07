import java.util.Base64;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {


    public static void main(String args[]) {
        //isMultipleOfThree(3);
        //isOdd(2);
        System.out.println(isOdd(2));
        System.out.println(isMultipleOfThree(2));
        System.out.println(fizzMultipleofThree(6));

        Person person = new Person();

    }

    public static boolean isOdd(int n) {
        boolean isTrue = true;
        while (isTrue) {
            if (n % 2 == 0) {
                System.out.println("Entered number is even");
                return true;
            } else {
                System.out.println("Entered number is odd");
                return false;
            }

        }
        return isTrue;

    }

    public static boolean isMultipleOfThree(int n) {
        boolean isTrue = true;
        if (isTrue) {
            for (int counter = 3; counter <= n; counter = counter + 3) {
                System.out.println(counter);
                return isTrue;
            }

        }
        return isTrue;
    }

    public static boolean isOddAndMultipleOfThree(int n) {
        boolean isTrue = true;
        while (isTrue) {
            for (int counter = 3; counter <= n; counter = counter + 3) {
                System.out.println(counter);
                return isTrue;
            }
        }
        if (n % 2 == 0) {
            System.out.println("Entered number is even");
            return true;
        } else {
            System.out.println("Entered number is odd");
            return false;
        }

    }

    public static String fizzMultipleofThree(int number) {
        if (number % 3 == 0) {
            if (number % 5 == 0) {
                System.out.println("fizzbuzz");
            } else {
                return "fizz";
            }
        } else if (number % 5 == 0) {
            System.out.println("buzz");

        }
        return String.valueOf(number);
    }


}


