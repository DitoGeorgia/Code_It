public class Main3 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int i = 0; i <= 24; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        for (int i = 25; i > 24 && i <=49; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        for (int i = 50; i > 49 && i <= 74; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        for (int i = 75; i > 74 && i <=99; i++) {
            System.out.print(array[i]+"\t");
        }
        //System.out.println();
    }
}