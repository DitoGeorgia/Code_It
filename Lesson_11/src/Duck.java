public class Duck {
    String name;
    int age;
    String color;

    static int footCount;

    public Duck(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void fly() {
        System.out.println(color + " утка по кличке " + name + " улетела в тёплые края с " + footCount + " ногами");
    }

    static void fly(int footCount) {
        Duck.footCount = footCount;
    }
}

