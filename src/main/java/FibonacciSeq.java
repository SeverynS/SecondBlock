/**Что-то мне подсказывает, что это не самое лучшее решение, но хочется об этом поговорить */
public class FibonacciSeq {
    public static void main(String[] args) {
        long first = 1;
        long second = 1;
        long third = 0;
        for(int i = 1; i < 55 ;) {

            if(first == 1 && second == 1){
                System.out.println(first);
                System.out.println(second);
                i += 2;
            }

            third = first + second;
            System.out.println(third);
            i++;

            first = second + third;
            System.out.println(first);
            if(i == 55)
                break;
            i++;
            second = first + third;
            System.out.println(second);
            i++;
        }
    }
}
