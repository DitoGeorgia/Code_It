import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("Введите сумму в ₾ : ");
        double summ = new Scanner(System.in).nextDouble();
        System.out.println(summ + "₾" + " = " + summ * 0.37 + " $");
        System.out.println(summ + "₾" + " = " + summ * 0.34 + " €\n");

        System.out.println(summ + "₾" + " = " + summ * (1/2.71) + " $");
        System.out.println(summ + "₾" + " = " + summ * (1/2.94) + " €");
    }
}
