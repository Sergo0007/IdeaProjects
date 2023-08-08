package homework_10;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork_10 {

    /*Заполните массив 20 случайными целыми числами. Программа должна вывести на экран массив, количество
     четных чисел в массиве и сумму всех четных чисел.*/
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];//определили массив на 20 элементов

        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = random.nextInt(100);
            System.out.println(array[counter]);

        }
        // количество четных чисел в массиве
         int count = 0; //cчетчик для четных чисел


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) { // текущий элемент делится на 2 без остатка
                count++; // увеличили стетчик на единицу
            }
        }
        System.out.println(" Количество четных чисел " + count);

        // cумма четных чисел
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) { // текущий элемент делится на 2 без остатка
                sum = sum + array[i]; // накапливаем сумму
            }
        }
        System.out.println(" сумма четных чисел " + sum);


    }

}





