package lesson_19;

import java.util.concurrent.Callable;

public class StaticInitDemo {
    private static Car[] cars;

    static {
        Car  car= new Car("Bmw ",200);
        Car  car1 = new Car("Seat ",300);
        Car car2 = new Car ("Audi ",250);
        cars[0] = car1;
        cars[1] = car;
        cars[2] = car2;
    }

    {
       // strings = new String[4];
       // strings[0] = "Hello";
       // strings[1] = "World";
      //  strings[2] = strings[0] + ", " + strings[1];

    }



};



