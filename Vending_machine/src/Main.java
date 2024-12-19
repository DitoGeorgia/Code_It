import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int twixPrice = 50;
        int marsPrice = 60;
        int snickersPrice = 80;
        int bonAquaPrice = 40;

        int sum1 = twixPrice + marsPrice + snickersPrice + bonAquaPrice;
        int sum2 = twixPrice + marsPrice + snickersPrice;
        int sum3 = twixPrice + marsPrice;
        int sum4 = twixPrice + snickersPrice + bonAquaPrice;
        int sum5 = twixPrice + snickersPrice;
        int sum6 = twixPrice + bonAquaPrice;

        int sum7 = marsPrice + snickersPrice + bonAquaPrice;
        int sum8 = marsPrice + snickersPrice;
        int sum9 = marsPrice + bonAquaPrice;

        int sum10 = snickersPrice + bonAquaPrice;


        System.out.println("Введите кол-во денег: ");
        int moneyAmount = new Scanner(System.in).nextInt();

        //todo Вы можете купить Twix и у вас оснется ... руб.
        int sum11 = moneyAmount - twixPrice;


        if (moneyAmount >= sum1) {
            System.out.println("Twix  Mars  Snickers  BonAqua");
        }
        if(moneyAmount >= sum2) {
            System.out.println("Twix  Mars  Snickers");
        }
        if(moneyAmount >= sum3) {
            System.out.println("Twix  Mars");
        }
        if (moneyAmount >= sum4) {
            System.out.println("Twix  Snickers  BonAqua");
        }
        if (moneyAmount >= sum5) {
            System.out.println("Twix  Snickers");
        }
        if (moneyAmount >= sum6) {
            System.out.println("Twix  BonAqua");
        }
        if (moneyAmount >= sum7) {
            System.out.println("Mars  Snickers  BonAqua");
        }
        if (moneyAmount >= sum8) {
            System.out.println("Mars  Snickers");
        }
        if (moneyAmount >= sum9) {
            System.out.println("Mars  BonAqua");
        }
        if (moneyAmount >= sum10) {
            System.out.println("Snickers  BonAqua");
        }
        if (moneyAmount >= sum11) {
            System.out.println("Twix \nСдача " + sum11);
        }
    }
}
