import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        int input = new Scanner(System.in).nextInt();
        if (input % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
