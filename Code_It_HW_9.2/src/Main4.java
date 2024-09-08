import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        System.out.println("Введите число:");
        int input = new Scanner(System.in).nextInt();
        System.out.println(input % 2 == 0);
    }
}