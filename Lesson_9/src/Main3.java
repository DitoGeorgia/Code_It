import java.util.Scanner;

public class Main3 {
    static int x = 0;
    static int y = 0;

    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите команду:\n1 - пойти вниз\n2 - пойти вверх\n3 - пойти налево\n4 - пойти направо\n" +
                    "5 - распечатать координаты\n");
            int command = new Scanner(System.in).nextInt();
            if (command == 1) {
                System.out.println("Введите кол-во шагов: ");
                int steps = new Scanner(System.in).nextInt();
                y -= steps;
            } else if (command == 2) {
                System.out.println("Введите кол-во шагов: ");
                int steps = new Scanner(System.in).nextInt();
                y += steps;
            } else if (command == 3) {
                System.out.println("Введите кол-во шагов: ");
                int steps = new Scanner(System.in).nextInt();
                x -= steps;
            } else if (command == 4) {
                System.out.println("Введите кол-во шагов: ");
                int steps = new Scanner(System.in).nextInt();
                x += steps;
            } else if (command == 5) {
                System.out.println("Координаты Y = " + y + "\n" + "Координаты X = " + x + "\n");
                return;
            } else {
                System.out.println("Команда не верна!!!");
            }
        }
    }


}
