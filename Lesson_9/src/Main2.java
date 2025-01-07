import java.util.Scanner;

public class Main2 {
    static int x = 0;
    static int y = 0;

    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите команду:\n1 - пойти вниз\n2 - пойти вверх\n3 - пойти налево\n4 - пойти направо\n" +
                    "5 - распечатать координаты\n");
            int command = new Scanner(System.in).nextInt();
            if (command == 1) {
                y--;
            } else if (command == 2) {
                y++;
            } else if (command == 3) {
                x--;
            } else if (command == 4) {
                x++;
            } else if (command == 5) {
                System.out.println("Координаты Y = " + y + "\n" + "Координаты X = " + x + "\n");
                return;
            } else {
                System.out.println("Команда не верна!!!");
            }
        }
    }
}
