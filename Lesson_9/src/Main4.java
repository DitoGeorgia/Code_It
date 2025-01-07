import java.util.Scanner;

public class Main4 {
    static int x = 0;
    static int y = 0;

    public static void main(String[] args) {
        while (true) {
            int command = inputCommand();
            int steps;
            if (command == 1) {
                y -= inputSteps();
            } else if (command == 2) {
                y += inputSteps();
            } else if (command == 3) {
                x -= inputSteps();
            } else if (command == 4) {
                x += inputSteps();
            } else if (command == 5) {
                print();
                return;
            } else {
                errorInput();
            }
        }
    }

    private static int inputCommand() {
        System.out.println("Введите команду:\n1 - пойти вниз\n2 - пойти вверх\n3 - пойти налево\n4 - пойти направо\n" +
                "5 - распечатать координаты\n");
        return new Scanner(System.in).nextInt();
    }

    private static int inputSteps() {
        System.out.println("Введите кол-во шагов: ");
        return new Scanner(System.in).nextInt();
    }

    public static void print() {
        System.out.println("Координаты Y = " + y + "\n" + "Координаты X = " + x + "\n");
    }

    private static void errorInput() {
        System.out.println("Команда не верна!!!");
    }
}
