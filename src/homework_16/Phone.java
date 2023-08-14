package homework_16;

public class Phone {
    int number;
    String model;
    double wight;

    public Phone (int number,String model,double wight){ // Конструктор c тремя параметрами
        this.number = number;
        this.model = model;
        this.wight = wight;
    }
    public Phone(int number ,String model){ // Конструктор с двумя параметрами
        this.number =  number;
        this.model = model;
    }

    public Phone(){ // Конструктор без параметров

    }
    public  void receiveCall(String name){ // Метод receiveCall c одним параметром
        System.out.println("Звонит " + name);

    }
    public void receiveСall(String name,int callerNumber){ // Перегруженный метод receiveCall с двумя параметрами
        System.out.println("Звонит " + name + ",номер телефона " + callerNumber);

    }
    public  int getNumber(){ //Метод getNumber
        return number;
    }

}

