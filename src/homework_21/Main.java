package homework_21;

public class Main {
    public static void main(String[] args) {
        Device device = new Device(1235, "xiaomi ");
        System.out.println();
        System.out.println(device.toString());

        Phone phone = new Phone(1237,"lg");
        System.out.println();
        System.out.println(phone.toString());

        Smartphone smartphone = new Smartphone(123,"lenovo");
        System.out.println();
        System.out.println(smartphone.toString());

    }
}
