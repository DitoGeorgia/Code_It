import java.util.Scanner;
//Формула преобразования: (F = C * 1.8 + 32)

public class Main2 {
    public static void main(String[] args) {
        while (true) {
            print();
        }
    }

    private static void print() {
        double result = inputNumber();
        System.out.println(result + " ℃ " + " = " + (result * 1.8 + 32) + " ℉ ");
    }

    private static double inputNumber() {
        System.out.println("Введите температуру по ℃ : ");
        return new Scanner(System.in).nextDouble();
    }
}
