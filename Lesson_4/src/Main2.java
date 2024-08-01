import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        int i = 2147483647;
        long l = 123456789L;

        double d = 12343.3d;
        boolean bool = false;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE +"\n");

        System.out.println(i + 10 + "\n");

        //--------------------------------------------------------------------

//        System.out.println("BMI = " + 75 / (1.75 * 1.75));
//
//        double weight = 75;
//        double height = 1.75;
//
//        System.out.println("BMI = " + weight / (height * height));

        //--------------------------------------------------------------------

        System.out.println("Введите свой вес(кг): ");
        double weight = new Scanner(System.in).nextDouble();
        System.out.println("Введите свой рост(м): ");
        double height = new Scanner(System.in).nextDouble();

        System.out.println("BMI = " + weight / (height * height));
    }
}
