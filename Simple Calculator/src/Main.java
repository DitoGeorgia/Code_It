import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        double number = new Scanner(System.in).nextDouble();

        System.out.println("Введите второе число: ");
        double number2 = new Scanner(System.in).nextDouble();

        System.out.println();
        System.out.println(number + " + " + number2 + " = " + (number + number2));
        System.out.println(number + " - " + number2 + " = " + (number - number2));
        System.out.println(number + " * " + number2 + " = " + (number * number2));
        System.out.println(number + " / " + number2 + " = " + (number / number2));

    }
}
