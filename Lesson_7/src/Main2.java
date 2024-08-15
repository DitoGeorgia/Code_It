import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
//        while (true) {
//            System.out.println("Hello");
//        }

        boolean isCantinue = true;
        while (isCantinue) {
            System.out.println("Hello");
            System.out.println("Continue? (1/0)");
            int input = new Scanner(System.in).nextInt();
            if(input == 0) {
                isCantinue = false;
            }
        }
    }
}
