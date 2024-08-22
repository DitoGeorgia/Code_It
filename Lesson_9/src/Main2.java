import java.util.Scanner;

public class Main2 {
    static int x = 0;
    static int y = 0;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nВведите команду:\n1-пойти вниз\n2-пойти вверх\n3-пойти направо\n" +
                    "4-пойти налево\n5-печать координат\n");
            int command = new Scanner(System.in).nextInt();
            if (command == 1) {
                y--;
            } else if (command == 2) {
                y++;
            } else if (command == 3) {
                x++;
            } else if (command == 4) {
                x--;
            } else if (command == 5) {
                System.out.println("Координаты: x " + x + ", y " + y);
            } else {
                System.out.println("Команда не верна!!!");
            }
        }
    }
}
