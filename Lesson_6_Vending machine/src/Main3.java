import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int twixPrice = 77;
        int marsPrice = 78;
        int snickersPrice = 100;
        int bonAquaPrice = 50;

        boolean isCanBuy = false;

        System.out.println("Введите кол-во денег: ");
        int moneyAmount = new Scanner(System.in).nextInt();

        if (moneyAmount >= twixPrice) {
            System.out.println("Twix");
            isCanBuy = true;
            if (moneyAmount % 3 == 0) {
                System.out.println("Вы выйграли счасливый билет на 100р. Обратитесь к администратору!!!");
            }
        }
        if (moneyAmount >= marsPrice) {
            System.out.println("Mars");
            isCanBuy = true;
        }
        if (moneyAmount >= snickersPrice) {
            System.out.println("Snickers");
            isCanBuy = true;
        }
        if (moneyAmount >= bonAquaPrice) {
            System.out.println("bonAqua");
            isCanBuy = true;
        }
        if (isCanBuy == false) {
            System.out.println("Не достаточно средств!!! ");
        }
    }
}
