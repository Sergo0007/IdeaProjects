package lesson_22;

public class Bus {

    public int id;
    private String model;
    private  int capacity;
    static  private int counteForId;

public  Bus(String model, int capacity){
    this.model = model;
    this.capacity = capacity;
    this.id = counteForId;
}
public String toString(){
    return "{id: " +  id + "; model: " + model +"}";
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}