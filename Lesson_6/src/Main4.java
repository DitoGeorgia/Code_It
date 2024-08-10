import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        int twixPrice = 2;
        int marsPrice = 3;
        int snickersPrice = 4;
        int bonAquaPrice = 1;

        boolean isCanBuy = false;

        while (true) {
            System.out.println("Введите кол-во денег: ");
            int moneyAmount = new Scanner(System.in).nextInt();

            if (moneyAmount >= twixPrice) {
                System.out.println("Вы можете купить Твикс!");
                isCanBuy = true;
                if (moneyAmount % 2 == 0) {
                    System.out.println("Вы выйграли купон на сумму 5 лари!!!");
                }
            }
            if (moneyAmount >= marsPrice) {
                System.out.println("Вы можете купить Марс!");
                isCanBuy = true;
            }
            if (moneyAmount >= snickersPrice) {
                System.out.println("Вы можете купить Сникерс!");
                isCanBuy = true;
            }
            if (moneyAmount >= bonAquaPrice) {
                System.out.println("Вы можете купить Воду!\n");
                isCanBuy = true;
            }
            if (isCanBuy = false) {
                System.out.println("У вас не хватает денежных средств!!!\n");
            }
        }
    }
}
