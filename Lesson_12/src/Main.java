public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.setX(5);
        robot.setY(5);


        robot.move(5, 10);
        System.out.println("Второе перемещение");
        robot.move(10, 15);

    }
}
