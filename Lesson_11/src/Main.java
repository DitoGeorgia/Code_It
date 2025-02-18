public class Main {
    public static void main(String[] args) {
//        Human vasya = new Human("Vasya", "'M'", 45);
//        System.out.println("Имя: " + vasya.name + "\nВозраст: " + vasya.age + "\nПол: " + vasya.gender);
//        vasya.walk(30);
//
//
//        Human petya = new Human("Petya", "'F'", 13);
//        System.out.println("\nИмя: " + petya.name + "\nВозраст: " + petya.age + "\nПол: " + petya.gender);
//        petya.walk(22);

        Duck.footCount = 2;
        Duck krya = new Duck("Krya", 2, "black");
        Duck gulya = new Duck("Gulya", 3, "brown");


        krya.fly();
        gulya.fly();
    }
}

