public class Human {
    String name;
    String gender;
    int age;

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void walk(int stepsCount) {
        if (stepsCount < 0) {
            // Проверка на отрицательные значения
            System.out.println("Количество шагов не может быть отрицательным.");
            return;
        }

        int lastDigit = stepsCount % 10;
        int lastTwoDigits = stepsCount % 100;

        if (stepsCount == 0) {
            System.out.println(name + " не сделал ни одного шага.");
        } else if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            // Особые случаи: 11–14
            System.out.println(name + " прошёл: " + stepsCount + " шагов");
        } else if (lastDigit == 1) {
            // Числа, оканчивающиеся на 1 (но не 11)
            System.out.println(name + " прошёл: " + stepsCount + " шаг");
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            // Числа, оканчивающиеся на 2, 3 или 4 (но не 12, 13, 14)
            System.out.println(name + " прошёл: " + stepsCount + " шага");
        } else {
            // Остальные случаи
            System.out.println(name + " прошёл: " + stepsCount + " шагов");
        }
    }
}



