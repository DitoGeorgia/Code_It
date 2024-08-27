import java.util.Random;

public class Main6 {
    public static void main(String[] args) {
        int[] people = new int[5];
        for (int i = 0; i < people.length; i++) {
            people[i] = new Random().nextInt(100);
        }
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}
