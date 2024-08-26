public class Main2 {
    public static void main(String[] args) {
        int[] array = new int[50];
        for (int i = 0; i < 50; i++) {
            array[i] = i + 11;
        }
        for (int i = 0; i < 50; i++) {
            System.out.println(array[i]);
        }
    }
}
