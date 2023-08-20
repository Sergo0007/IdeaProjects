package lesson_23.Hum;

public class AmateurAthlete extends Human {

    public AmateurAthlete(String name) {
        super(name);
    }


    public void run() {
        System.out.println(getName() + "Бежит со скоростью 15 км в час");
    }
    public void restingTime(){
        System.out.println("отдых 10 минут");
    }

    public String toString() {
        return "AmateurAthlete name: " + getName();

    }

}
