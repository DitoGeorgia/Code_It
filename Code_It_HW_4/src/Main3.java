import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        // F = C * 1.8 + 32

        System.out.println("Введите температуру по ºC: ");
        double t = new Scanner(System.in).nextDouble();
        System.out.println(t + "ºC" + " = " + (t * 1.8 + 32) + "ºF" );


        System.out.println("Введите температуру по ºC: ");
        double t2 = new Scanner(System.in).nextDouble();
        double F = t2 * 1.8 + 32;
        System.out.println(t2 + "ºC" + " = " + F + "ºF" );

    }
}
