import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int twixPrice = 77;
        int marsPrice = 78;
        int snickersPrice = 100;
        int bonAquaPrice = 50;

        System.out.println("Введите кол-во денег: ");
        int moneyAmount = new Scanner(System.in).nextInt();

        if (moneyAmount >= twixPrice) {
            System.out.println("Twix");
        }
        if (moneyAmount >= marsPrice) {
            System.out.println("Mars");
        }
        if (moneyAmount >= snickersPrice) {
            System.out.println("Snickers");
        }
        if (moneyAmount >= bonAquaPrice) {
            System.out.println("bonAqua");
        }
    }
}

