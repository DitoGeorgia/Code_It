import java.util.Random;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Введите кол-во людей: ");
        int numberOfPeople = new Scanner(System.in).nextInt();
        int[] people = new int[numberOfPeople];

        //int[] people = new int[5];
        for (int i = 0; i < people.length; i++) {
            people[i] = new Random().nextInt(100);
        }
        for (int i = 0; i < people.length; i++) {
            System.out.println("Возраст: " + people[i]);
        }

        /*
        System.out.println("Возраст: " + people[0]);
        System.out.println("Возраст: " + people[1]);
        System.out.println("Возраст: " + people[2]);
        System.out.println("Возраст: " + people[3]);
        System.out.println("Возраст: " + people[4]);
        */

        int summ = 0;
        for (int i = 0; i < people.length; i++) {
            summ += people[i];
        }
        System.out.println("Средний возраст: " + summ / people.length);
    }
}
