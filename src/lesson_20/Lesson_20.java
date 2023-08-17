package lesson_20;

import java.util.Arrays;
import java.util.Random;

public class Lesson_20 {
    public static void main(String[] args) {

        int[] ints = {34,21,67,41,10,5,0,87,99,38,57,3,77};

        System.out.println(ints.length);

        System.out.println(ArrayUtil.lineaSearch(ints,100));


        System.out.println("До сортировки");
        System.out.println(Arrays.toString(ints));

        ArrayUtil.sortSelection(ints);

        System.out.println();
        System.out.println("После сортировки");

        // Эаменить метод на самописный
        //System.out.println(Arrays.toString(ints));
        ArrayUtil.printArray(ints);//эамена

        int numberForSearch = 87;

        int idx = ArrayUtil.binarySearch(ints, numberForSearch);
        System.out.println("Индекс числа" + numberForSearch + " = " + idx);

        int[]testArray =  new int[10000];
        Random random = new Random();
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = random.nextInt(1000);
        }

        ArrayUtil.sortSelection(testArray);

        numberForSearch = 970;
        idx = ArrayUtil.binarySearch(testArray, numberForSearch);
        System.out.println(" Индекс числа " + numberForSearch + " = " + idx );


    }
}
