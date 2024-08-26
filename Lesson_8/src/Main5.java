public class Main5 {
    public static void main(String[] args) {
        char[] array = new char[100];
        for (int i = 0; i < 100; i++) {
            array[i] = (char) (i + 1);
        }
        for (int i = 32; i < 100; i++) {
            System.out.println(array[i]);
        }
    }
}
