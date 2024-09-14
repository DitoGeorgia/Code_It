public class Main {
    public static void main(String[] args) {
        Duck.footCount = 2;
        Duck krya = new Duck("Кря", 3, "Серая");
        Duck gylya = new Duck("Гуля", 5, "Серебристая");

        krya.fly();
        gylya.fly();

    }
}
