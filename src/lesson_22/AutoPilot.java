package lesson_22;

public class AutoPilot {

    private final int id;

    private  String model;

    private boolean isActive;//false

    static int counter;

    public AutoPilot(String model) {
        this.model = model;
        this.id = counter++;
    }
}
