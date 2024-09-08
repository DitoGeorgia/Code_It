import java.util.Random;

public class Main8 {
    public static void main(String[] args) {
        int[] people = {20,25,30,35,40};
//        for (int i = 0; i < people.length; i++) {
//            people[i] = new Random().nextInt(90);
//        }
        System.out.println();
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
        double summ = 0;
        for (int i = 0; i < people.length; i++) {
            summ += people[i];
        }
        System.out.println("\nСредний врзраст: " + summ / people.length);
    }
}
