public class Main {
    public static void main(String[] args) {
        int age = 0;
        test(age,0.0,"Hello",0,0);
        test2(0,0,0,0,0);
    }

    public static void test(int a, double b, String c, int d, int e) {
        System.out.println(a + b + c + d + e);
    }

    public static void test2(int f, int g, int h, int i, int j) {
        System.out.println(f - g - h - i - j);
    }
}
