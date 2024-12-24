import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        int[] people = new int[5];
        for (int i = 0; i < people.length; i++) {
            people[i] = new Random().nextInt(100);
        }

        int summ = 0;
        for (int i = 0; i < people.length; i++) {
            summ += people[i];
        }
        System.out.println("Средний возраст: " + summ / people.length);
    }
}
