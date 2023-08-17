package lesson_19.lesson_21;

public class Person {

    private String name;

    private boolean isKind;

    private boolean isHaveSpecialRequirements;

    public Person(String name) {
        this.name = name;
    }
    public void move(){
        System.out.println("Я пережвигаюсь ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setKind(boolean isKind){
        this.isKind = isKind;
    }
    public boolean isKind(){
        return isKind;
    }

    public Person(boolean isKind) {
        this.isKind = isKind;
    }
    public boolean isHaveSpecialRequirements(){
        return isHaveSpecialRequirements;
    }
    public void  setHaveSpecialRequirements(boolean haveSpecialRequirements){

    }
}
