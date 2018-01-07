import java.util.Random;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

    public static void main(String args[]) {

    }

    public static int calculateSquare(int num) {
        System.out.println("You entered: " + num);
        num = num * num;
        System.out.println("Your number squared is: " + num);
        return num;

    }

    public static double calculateSquareRoot(int number) {
        double t;

        double squareRoot = number / 2;

        do {
            t = squareRoot;
            squareRoot = (t + (number / t)) / 2;
        } while ((t - squareRoot) != 0);

        return squareRoot;
    }


    public static String toLowerCase(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return s.substring(1).toLowerCase();
    }

    public Integer random(Integer integer) {
        Random rand = new Random();
        ;
        int min = 0, max = 100;
        int randomNum = rand.nextInt(max - min + 1) + min;

        System.out.println(randomNum);
        return randomNum;
    }

    public static int rand(int min, int max) {
        Random rand = new Random();

        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
}
