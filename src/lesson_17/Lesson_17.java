package lesson_17;

import java.util.Arrays;

public class Lesson_17 {
    public static void main(String[] args) {


        //int[] array = new int[1];
        //array[0] = var;


        RubberArray rb = new RubberArray();

        rb.printArray();

        rb.add(10);
        rb.add(25);
        rb.add(-20);

        rb.printArray();

        int raSize = rb.size();
        System.out.println(" Сейчас в массиве " + raSize + " элемнтов ");
        System.out.println(" Сумма знанмй элементов массива " + rb.sumOfValues());

        rb.add(7, 14, -21, 15, 25);

        rb.printArray();

        System.out.println(" Min в массиве " + rb.min());
        System.out.println("Max в массиве " + rb.max());

        int[]newArray = rb.toArray();

        newArray[0] = 10_000;
        System.out.println(Arrays.toString(newArray));
        rb.printArray();

        rb.deleteByIndex(3);
        rb.printArray();

        RubberArray rubberArray = new RubberArray(newArray);




    }

}
