import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int num = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        int num2 = new Scanner(System.in).nextInt();

        if(num > 5 && num2 < 5) {
            System.out.println("Hello World");
        }
        if(num < 5 || num2 > 5) {
            System.out.println("Goodbye World");
        }
    }
}
