
// Однострочный коментарий ( Ctrl + / )

/*
Многострочный коментарий
    Многострочный коментарий  ( Ctrl + Shift + / )
*/

/**
 * Java Docs
 */

public class Main {
    public static void main(String[] args) {
        // Основные Математические действий
        System.out.println(5 + 5);        // 10
        System.out.println(5 - 5);        // 0
        System.out.println(5 / 5);        // 1
        System.out.println(5 / 2);        // 2  --- > int (целые числа) делятся без остатка
        System.out.println(5 % 2);        // 1  --- > остаток от деления
        System.out.println(5.0 / 2);      // 2.5
        System.out.println(5 + 5 * 2);    // 15
        System.out.println((5 + 5) * 2);  // 20

//  --->  Если к строке прибавить число, то это число становится строкой

        System.out.println();
        System.out.println("3" + 1); // 31
        System.out.println(3 + 1);   // 4


//  --->  В Java / String (Строку) и на строку нельзя ( * , / , - )

        /*
        System.out.println("3" * 1);
        System.out.println("3" / 1);
        System.out.println("3" - 1);
        System.out.println(1 * "3");
        System.out.println(1 / "3");
        System.out.println(1 - "3");
        */

    }
}
