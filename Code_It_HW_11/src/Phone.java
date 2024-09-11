import java.security.PublicKey;

public class Phone {

    static String madeIn;

    String number;
    String model;
    double weight;

    public Phone() {
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name) {
        receiveCall(name, "");
    }

    public void receiveCall(String name, String number) {
//        System.out.println("Звонит абонент по имени " + name + (number == "" ? "" :" номер " + number));

        if (number == "") {
            System.out.println("Звонит абонент по имени " + name);
        } else {
            System.out.println("Звонит абонент по имени " + name + " номер " + number);
        }

//        String text;
//        if (number == "") {
//            text = "Звонит абонент по имени " + name;
//        } else {
//            text = "Звонит абонент по имени " + name + " номер " + number;
//        }
//        System.out.println(text);
    }
}
