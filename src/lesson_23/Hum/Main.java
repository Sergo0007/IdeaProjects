package lesson_23.Hum;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Obama ");
        System.out.println(human.toString());
        human.run();
        human.restingTime();

        AmateurAthlete amateurAthlete = new AmateurAthlete("Tramp ");
        System.out.println(amateurAthlete.toString());
        amateurAthlete.run();
        amateurAthlete.restingTime();

        AthletePro athletePro = new AthletePro("Жека Байден ");
        System.out.println(athletePro.toString());
        athletePro.run();
        athletePro.restingTime();


    }
}
