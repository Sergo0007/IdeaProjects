package lesson_22;

public class BusDriver {
    private final int id;

    private String name;
    private String[]categories;
    private  int age;
    static  private int counter;

    public BusDriver(String name,int age) {
        this.name = name;
        this.age = age;
        this.categories = new String[1];
        categories[0] = "B";
        this.id = counter++;
    }


    }

