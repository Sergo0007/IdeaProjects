package lesson_19.lesson_21;
public class  Car extends Vehicle{
    private int mileage;


    public Car(String model, int yearOfManufacture) {
        super(model, yearOfManufacture);
    }


    public int getMileage() {
        return mileage;
    }

    public void goToRoute(int routeLength) {
        System.out.println("Отправляюсь в поездку по маршруту");
        gas();
         // какой то код
        breaking();
        mileage += routeLength;
    }



    }



