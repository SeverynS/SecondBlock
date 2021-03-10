public class MultByFive {
    public static void main(String[] args) {
        System.out.println(multByFive(5));
    }

    public static int multByFive(int userInput) {
        int temp = 0;
        for(int i = 0; i < userInput; i++) {
            temp += 5;
        }
        return temp;
    }
}
