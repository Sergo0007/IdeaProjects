package lesson_23.Hum;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;

    }

    public void Human() {
    }

    public String getName() {
        return name;
    }

    public void run() {
        System.out.println(this.name + "Бежит cо саоростью 10 км в час ");

    }
    public void restingTime(){
        System.out.println(" отдых 15 минут ");


    }

    public String toString() {
        return "Human [name " + name + "]";

    }
}