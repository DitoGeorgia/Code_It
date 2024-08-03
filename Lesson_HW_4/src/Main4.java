import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        System.out.println("\n\t\t***Конвертер валют***\n");

        System.out.println("Введите сумму в ₾ : ");
        double summ = new Scanner(System.in).nextDouble();
        System.out.println("Введите курс \"$\" : ");
        double dollarPrice = new Scanner(System.in).nextDouble();
        System.out.println("Введите курс \"€\" : ");
        double euroPrice = new Scanner(System.in).nextDouble();

        System.out.println(summ + "₾" + " = " + summ * 0.37 + " $");
        System.out.println(summ + "₾" + " = " + summ * 0.34 + " €\n");

        System.out.println(summ + "₾" + " = " + summ * (1/dollarPrice) + " $");
        System.out.println(summ + "₾" + " = " + summ * (1/euroPrice) + " €");
    }
}
