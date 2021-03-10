import java.util.concurrent.ThreadLocalRandom;

public class OddOrEven {
    public static void main(String[] args) {
        int n = ThreadLocalRandom.current().nextInt();
        System.out.println("Сгенерированное число, для проверки: " + n);
        if(n % 2 == 0)
            System.out.println("The number is odd");
        else
            System.out.println("The number is even");
    }
}
