//    Индекс массы тела (Body mass index)
//    Индекс Массы Тела рассчитывается по формуле: ИМТ= вес (кг) / рост м².

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите вес в кг: ");
            double weight = new Scanner(System.in).nextDouble();
            System.out.println("Введите рост в м²: ");
            double height = new Scanner(System.in).nextDouble();

            System.out.println("\t***Калькулятор BMI***");
            System.out.println("BMI: " + weight / (height * height));
        }
    }
}
