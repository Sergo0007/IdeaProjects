package homework_16;

public class HomeWork_16 {
    public static void main(String[] args) {
        // создание экземпляров класса Phone
        Phone phone1 = new Phone(777777,"Xiaomi ",0.75);
        Phone phone2 = new Phone(9999999,"Lg",0.80);
        Phone phone3 = new Phone(888888,"Nokia ",0.90);
        System.out.println("Phone number " + "Phone model " + "Phone wight ");

        // Вывод значений полей обьектов на консоль
        System.out.println("Телефон 1:");
        System.out.println("Номер: " + phone1.getNumber());
        System.out.println("Модель: " + phone1.model);
        System.out.println("Вес: " + phone1.wight + "кг ");

        System.out.println("\nТелефон 2: ");
        System.out.println("Номер: " + phone2.getNumber());
        System.out.println("Модель:" + phone2.model);
        System.out.println("Вес: " + phone2.wight);

        System.out.println("\nТелефон 3: ");
        System.out.println("Номер: " + phone3.getNumber());
        System.out.println("Модель: " + phone3.model);
        System.out.println("Вес: " + phone3.wight);

        // вызов метода receiveCall
        System.out.println("\nМетод receiveCall для телефона 1:");
        System.out.println("Анжела Меркелева ");

        System.out.println("\nМетод receiveCall для телефона 2:");
        System.out.println("Женя Байденюк ");

        System.out.println("\nМетод receiveCall для телефона 3:");
        System.out.println("Ваха ");

        phone1.receiveСall("Arni ", 4444444);



    }
}
