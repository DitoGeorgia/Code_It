public class Main {
    public static void main(String[] args) {
        /*int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] += i + 10;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        double[] array = new double[5];
        for (int i = 0; i < array.length; i++) {
            array[i] += i + 10;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/

        char[] array = new char[50];
        for (int i = 0; i < array.length; i++) {
            array[i] += (char) (i + 20);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

