import java.util.Scanner;
//Формула преобразования: (F = C * 1.8 + 32)



public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите температуру по ℃ : ");
            double temp = new Scanner(System.in).nextDouble();
            System.out.println(temp + " ℃" + " = " + (temp * 1.8 + 32) + " ℉ ");
        }
    }
}
