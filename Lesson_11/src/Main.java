public class Main {
    public static void main(String[] args) {
        Human vasya = new Human("Вася", 51);
        vasya.walk(10);
        System.out.println("Имя: " + vasya.name + "\nВозраст: " + vasya.age + "\nПол: " + vasya.gender +"\n");

        Human petya = new Human("Петя", "M", 13);
        petya.walk(20);
        System.out.println("Имя: " + petya.name + "\nВозраст: " + petya.age + "\nПол: " + petya.gender);
    }
}
