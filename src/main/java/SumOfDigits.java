import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        String userInput = scanner.nextLine();
        sumOfDigits(userInput);
    }

    public static void sumOfDigits(String userInput) { // рзвлёкся со сложением char`ов :)
        char[] chars = userInput.toCharArray();
        int k = 0;

        for (char aChar : chars) {
            k = k + Character.getNumericValue(aChar);
        }

        System.out.println("The sum of digits is: " + k);
    }
}
