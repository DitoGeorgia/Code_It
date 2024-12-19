import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int num = new Scanner(System.in).nextInt();
        if (num == 5) {
            System.out.println("5");
        } else if (num == 6) {
            System.out.println("6");
        } else if (num == 7) {
            System.out.println("7");
        } else {
            System.out.println("N/A");
        }
    }
}
