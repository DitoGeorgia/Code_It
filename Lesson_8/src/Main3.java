public class Main3 {
    public static void main(String[] args) {
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int i = 0; i < array.length; i++) {
            if (i <= 9)
                System.out.print(array[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (i > 9 && i <= 19)
                System.out.print(array[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (i > 19 && i <= 29)
                System.out.print(array[i] + "\t");
        }
    }
}