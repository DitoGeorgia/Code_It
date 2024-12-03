import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите сумму в ₾: ");
            double summ = new Scanner(System.in).nextDouble();
            System.out.println(summ + " ₾ " + " = " + (summ * 0.36) + " $ ");
            System.out.println(summ + " ₾ " + " = " + (summ * 0.34) + " € ");
        }
    }
}
