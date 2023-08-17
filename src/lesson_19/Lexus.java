package lesson_19;

public class Lexus {
    int noStatic = 20;

    static  int staticInt = 20;

    public static void main(String[] args) {

        Car car = new Car("Audi ",250);
        Car car1 = new Car("Bmw ",300);


        System.out.println("Всего создано мвшин: " + Car.numberOfCars);
       //- Car.showStaticInfo();
        //car1.showStaticInfo();обращение к статик методу возможно от
        // но так делать не нужно!"

        // static int a = 1; не допустимое место для создания static переменной

        staticInt++;
        test();
        //testNotStatic();  нет доступа
        // вызов статического метода класса
     //-   System.out.println("Сумма чисел " + MathUtils.sumOfInts(5));
        Math.sqrt(4);// класс состоящий только из статических методов
    }
    static  void test(){// в статических методах

    }

}
