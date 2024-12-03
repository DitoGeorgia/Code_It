import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите сумму в ₾: ");
            double sum = new Scanner(System.in).nextDouble();
            System.out.println(sum + " ₾ " + " = " + (sum * 0.36) + " $ ");
            System.out.println(sum + " ₾ " + " = " + (sum * 0.34) + " € ");
        }
    }
}
