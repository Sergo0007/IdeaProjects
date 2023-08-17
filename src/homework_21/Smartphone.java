package homework_21;

public class Smartphone extends Device{
    private String camera;


    public Smartphone(int model, String brand) {
        super(model, brand);
    }

    public String getCamera(){
        return camera;
    }
    public void cameraShots(){

    }
    public String toString(){
        return "Smartphone: " + "cameraShots ";
    }


    }

