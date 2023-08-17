package homework_18;

public class Cat {
    String name;
    double weight;

    public Cat(String catName, double weight) {
        name = catName;
        this.weight = weight;
    }

    void startTraining(int laps) {
        System.out.println("Старт тренипровки с " + laps + "Кругами");
        for (int i = 0; i < laps; i++) {
            System.out.println("Круг № " + (i + 1));
            run(); // ==> this.run();
            System.out.println("end lap \n");

        }
    }

    void run() {
        while (weight <= 2) {
            System.out.println("Я слищком голоден и слишком худой!Бегать не могу!!мой вес " + weight);
            eat();
            System.out.println("Мой вес после еды " + weight);
        }
        System.out.println("я бегу!Ох как тяжело...( " + weight);
        weight -= 2;
    }

    void eat() {
        System.out.println("Я кушаю");
        weight++;
    }

    void whoAmi() {
        System.out.println("Я котик " + name + "и я вешу " + weight + "кг. Мяу!");
    }


}


