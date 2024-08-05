import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Введите первое число: ");
            int a = new Scanner(System.in).nextInt();

            System.out.println("Введите второе число: ");
            int b = new Scanner(System.in).nextInt();

            System.out.println("Введите третье число: ");
            int с = new Scanner(System.in).nextInt();

            if (a > 5 && b < 5 || с < 5) {
                System.out.println("Hello World");
            }
//            if (a < 5 && b > 5) {
//                System.out.println("Goodbye World");
//            }
        }
    }
}
