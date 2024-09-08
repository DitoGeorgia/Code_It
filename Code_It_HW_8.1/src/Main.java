public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        //todo
        int[] array = {3, 4, 5, 13, 14, 15, 23, 24, 25, 30};

        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        //todo
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        //todo
        System.out.println("\n======================================\n");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + "\t");
        }

        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        //todo
        System.out.println("\n======================================\n");
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - (1 + i)];
            array[array.length - (1 + i)] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("======================================\n");
    }
}
