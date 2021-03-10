import java.util.Scanner;

public class FromOneToInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //кажется мне, что сканер давно не пользуют, в приличном обществе, так?
        System.out.print("Enter your digit: ");
        int userInput = scanner.nextInt();
        fromOneToInput(userInput);
    }

    public static void fromOneToInput(int userInput) {

        int temp = 0;
        int i = 0;

        while (i <= userInput) {
            temp = temp + i;
            i++;
            //if(temp >= 70 && temp <= 201) - 6 задача
            //System.out.println(temp);
        }
        System.out.println(temp);
    }

}
