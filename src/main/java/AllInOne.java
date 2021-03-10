import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class AllInOne {
    public static void main(String[] args) {
        //fromOneToFive();
        //fromOneToEightyEven();
        //fromFiveToOne();
        //multByTen();

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your digit: ");
        int userInput = scanner.nextInt();
        fromOneToInput(userInput);*/

        //oddSequence();

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        String userInput = scanner.nextLine();
        sumOfDigits(userInput);*/

        //fibonacciSeq();

        //System.out.println(multByFive(9));

        oddOrEven();
    }

    public static void fromOneToFive() {
        for(int i = 1; i <= 5; i++) {
            System.out.print(i);
        }
    }

    public static void fromOneToEightyEven() {
        for(int i = 1; i <= 80; i++) {
            if (i % 2 == 0)
                System.out.print(i);
        }
    }

    public static void fromFiveToOne() {
        for(int i = 5; i >= 1; i--) {
            System.out.print(i);
        }
    }

    public static void multByTen() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("1 * " + i + " = " + i*10);
        }
    }

    public static void fromOneToInput(int userInput) {
        int temp = 0;

        for(int i = 0; i <= userInput; i++) {
            temp = temp + i;
            /*if(temp >= 70 && temp <= 201) - 6 задача
                System.out.println(temp);*/
        }

        System.out.println("Number is: " + temp);
    }

    public static void oddSequence(){ // изначально пробовал на for, но получалась какая-то фигня :)
        int i = 1;
        while(i <= 55) {
            System.out.println(i);
            i = i + 2;
        }
    }

    public static void sumOfDigits(String userInput) { // рзвлёкся со сложением char`ов :)
        char[] chars = userInput.toCharArray();
        int k = 0;

        for (char aChar : chars) {
            k = k + Character.getNumericValue(aChar);
        }

        System.out.println("The sum of digits is: " + k);
    }

    public static void fibonacciSeq() {
        long first = 1;
        long second = 1;
        long third = 0;
        for(int i = 1; i < 55 ;) {
            if(first == 1 && second == 1){
                System.out.println(i + " " + first);
                System.out.println(i + " " + second);
                i += 2;
            }
            third = first + second;
            System.out.println(i + " " + third);
            i++;

            first = second + third;
            System.out.println(i + " " + first);
            if(i == 55)
                break;
            i++;
            second = first + third;
            System.out.println(i + " " + second);
            i++;
        }

    }

    public static int multByFive(int userInput) {
        int temp = 0;
        for(int i = 0; i < userInput; i++) {
            temp += 5;
        }
        return temp;
    }

    public static void oddOrEven() {
        int n = ThreadLocalRandom.current().nextInt();
            System.out.println("Сгенерированное число, для проверки: " + n);
        if(n % 2 == 0)
            System.out.println("The number is odd");
        else
            System.out.println("The number is even");
    }
}
