package homwork_13;

import java.util.Random;

public class HomWork_13 {
    public static void main(String[] args) {
    /* написать метод возвращающий массив целых чисел ,
    заданной долины .Массив должен быть заполнен случайными числами.
    Перегрузка. Диапазон случайных чисел может быть задан вторым арнументом выхова метода
    */
        int length = 10;
        int min = 0;
        int max = 100;
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(100);

    }

    public static int[] generateArray(int length, int min, int max) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
            int[] randomArray = generateArray(length, min, max);

        }
        for (int number : generateArray(length, min, max)) {


            }
            return array;


        }

    }





