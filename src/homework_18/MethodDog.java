package homework_18;



public class MethodDog {
    public static void main(String[] args) {
       Dog dog1 = new Dog("Barbos ", 50);



        for (int i = 0; i < 7; i++) {
            dog1.training();

        }

        System.out.println("**********");
       // System.out.println(" jumpHeight " + dog1.getJumpHeight());
        //System.out.println(" maxJumpHeight " + dog1.getJumpHeight());

        System.out.println("******Rax*******");
        Dog dog = new Dog("Rax ", 150);
       // System.out.println(dog.getMaxJumpHeight());
        //dog.setMaxJumpHeight(3);


        //int barrier = 120;
        //dog.getBarrier(barrier);

        // barrier = 180;
        // dog.getBarrier(barrier);

        int[] barriers = {120, 180, 160, 280, 350, 50};
        for (int barrier : barriers) {
            dog.getBarrier(barrier);
        }

    }

}



