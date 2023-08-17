package homework_21;

public class Device {
    private String device;
    private int model;
    private String brand;

    public  Device(int model, String brand){
        this.brand = brand;
        this.model = model;

    }

    public String getDevice() {
        return device;
    }

    public int getModel() {
        return model;
    }
    public String getBrand(){
        return brand;
    }
    public  String toString(){
        return "device: "  + brand + " " + model;
    }

}
