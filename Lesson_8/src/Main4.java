public class Main4 {
    public static void main(String[] args) {
        double[] array = new double[50];
        for (int i = 0; i < 50; i++) {
            array[i] = i + 11;
        }
        for (int i = 0; i < 50; i++) {
            System.out.println(array[i]);
        }
    }
}
