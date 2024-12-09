//    Индекс массы тела (Body mass index)
//    Индекс Массы Тела рассчитывается по формуле: ИМТ= вес (кг) / рост (м)2.

public class Main {
    public static void main(String[] args) {
        double weight = 75;
        double height = 1.75;
        System.out.println("\t***Калькулятор BMI***");
        System.out.println("BMI: " + weight / (height * height));
    }
}
