public class Main5 {
    public static void main(String[] args) {
        char[] array = new char[50];
        for (int i = 32; i < array.length; i++) {
            array[i] = (char) (i + 1);
        }
        for (int i = 32; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
