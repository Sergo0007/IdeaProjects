package lesson_17;

import java.util.Arrays;


public class RubberArray {

    int[] array;

    public RubberArray() { // конструктор
        this.array = new int[0];

    }
    public RubberArray(int[]arr){
        this();// new RubberArray();
        add(arr);
    }

    public void add(int value) { // добавлене 1 элемента
        extractArray();
        array[array.length - 1] = value;

    }

    public void add(int... ints) { // принимает произвольное количество аргументов типа int
        for (int value : ints) {
            add(value);
        }
    }


    public void extractArray() { // расщирение массива на 1 ячейку
        array = Arrays.copyOf(array, array.length + 1);
    }

    public void printArray() { ////Вывести на консоль массив
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print("; ");
            }

        }
        System.out.print("]");
        System.out.println();
    }

    public int size() { // количество элементов в массиве
        return array.length;
    }

    public int sumOfValues() { // cумма значений в массиве
        int sum = 0;
        for (int value : array) {
            sum += value;

        }
        return sum;
    }

    public int min() { // возвращаем мин значение из массива
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min += value;
            }
        }
        return min;
    }

    public int max() { //возвращаем макс значение из массива
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }

        }
        return max;
    }

    public int[] toArray() {//нужно создать копию массива и ее вернуть
        int[] result = new int[array.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = array[i];
        }
        return result;

    }

    public void deleteByIndex(int index) {
        if (array.length >= 0 && index < array.length) {

            int[] result = new int[array.length - 1];
            for (int i = 0; i < result.length; i++) {
                if (i < index) {
                    result[i] = array[i];
                } else { //(i >= 0){
                    result[i] = array[i + 1];

                }
            }
            //    System.out.println("Result" + Arrays.toString(result));
            array = result;
        }
    }


    }

