import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("\n\t\t***Калькулятор умножения!***\n");

        System.out.println("Введите первое число: ");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Введите второе число: ");
        double b = new Scanner(System.in).nextDouble();

        System.out.println(a + " * " + b + " = " + a*b );
    }
}
