package lesson_16;

public class Lesson_16 {
    public static void main(String[] args) {
        //System.out.println();
        //System.out.println("\"Маша\"\n");
        Cat cat = new Cat("Max", 5.0);

        // cat.whoAmi();
        //cat.eat();
        //cat.whoAmi();
        // cat.run();
        // cat.whoAmi();
        System.out.println("Start training");

        cat.startTraining(10);
        cat.whoAmi();

    }
}
