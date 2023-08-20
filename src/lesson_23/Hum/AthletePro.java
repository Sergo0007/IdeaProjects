package lesson_23.Hum;

public class AthletePro extends Human {
    public AthletePro(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + "Пробежал со скоростью 25 км за час во сне ");

    }
    public void restingTime(){
        System.out.println("отдых 5 минут");

    }


    public String toString() {
        return "AthletePro name: " + getName();

    }
}
