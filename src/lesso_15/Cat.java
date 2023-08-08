package lesso_15;

public class Cat {


    String name;



    String color;


    int age;

    public  Cat(int age,String name){
        this.age = age ;
        this.name = name;
    }

    void sayMeow(){
        System.out.println("Meow");

    }
    void sleep() {
        System.out.println("I am sleeping");
    }

    void running(){
        System.out.println("I am running");
    }
}
