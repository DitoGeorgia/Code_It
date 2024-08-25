import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        boolean isContinue = true;
        int x = 0;
        int y = 0;
        while (isContinue) {
            System.out.println("Направление движения:\n1 - вверх\n2 - вниз\n3 - вправо\n4 - влево");
            System.out.println("Введите число: ");
            int input = new Scanner(System.in).nextInt();
            if (input == 1) {
                y++;
            } else if (input == 2) {
                y--;
            } else if (input == 3) {
                x++;
            } else if (input == 4) {
                x--;
            } else {
                System.out.println("Error");
                isContinue = false;
            }
            System.out.println("Координаты: по вертикали: " + y + ", по горизонтали: " + x );
        }
    }
}
