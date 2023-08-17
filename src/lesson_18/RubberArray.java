package lesson_18;

import java.util.Arrays;

public class RubberArray {
    private int[] array;

    public RubberArray() { // конструктор
        this.array = new int[0];
        //public RubberArray(int[]arr){ // Проблема! отдаем ссылку!Значения в массиве класса мргут быть изменены без нашего контроля
        //this.array = arr;

    }
    //public  RubberArray(int[] arr) { var1
    //this.array = new int[arr.length];
    // for( int i = 0; i < array.length; i++){
    //array[i] = arr[i];

    // public  RubberArray(int[]arr){ //var2
    //    this.array = Arrays.copyOf(arr,arr.length);
    // }
    public RubberArray(int[] arr) { //var 3
        this(); // this.array = new int[0]
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

    public int sumOfValues() {  // сумма значений в массиве
        int sum = 0;
        for (int value : array)
            sum += value;
        return sum;
    }

    public int min() { // возвращаем мин значение из массива
        if (array.length == 0) return Integer.MIN_VALUE;
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public int max() { //возвращаем макс значение из массива
        if (array.length == 0) return Integer.MAX_VALUE;
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }

        }
        return max;
    }

    public int[] toArray() {//нужно создать нашу копию массива и ее вернуть
        int[] result = new int[array.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = array[i];
        }
        return result;
        // result[i] = array[i];

    }

    public void deleteByIndex(int index) {
        if (array.length >= 1 && index >= 0 && index < array.length) {

            int[] result = new int[array.length - 1];
            for (int i = 0; i < result.length; i++) {
                if (i < index) {
                    result[i] = array[i];
                } else { // if(i >= index){
                    result[i] = array[i + 1];

                }
            }
            //    System.out.println("Result" + Arrays.toString(result));
            array = result;
        }
    }

    public int searchByValue(int value) { // поиск элемента по значению.Возращаем индекс
        for (int i = 0; i < array.length; i++) {
            if (array[i] == i++) return i;

        }
        return -1;
    }

    public boolean deleteByValue(int value) { // удаление по эначению
        System.out.println("Start delete by value! ");
        int indexByValue = searchByValue(value);
        if (indexByValue < 0) return false;
        deleteByIndex(indexByValue);
        return true;


    }

    public int deleteAllByValue(int value) {//поиск и удалене всех элементов по значению х
        int count = 0;
        // пытакмся найти значение в массиве.Если находим -> удаляем и возвпащаем true.
        // входим в тело while,если не находим возвращается false.ВЫходим из цикла while

        while (deleteByValue(value)) {

            count++;
        }
        return count;

    }

    public int getValueByIndex(int index) { // возврат значения по индексу в массиве
        if (isIndexCorrect(index)) {
            return Integer.MIN_VALUE;
        }
        return array[index];
    }

    public boolean changeValueByIndex(int index, int newValue) {
        if (isIndexCorrect(index)) {
            return false;
        }
        array[index] = newValue;
        return true;
    }

    private boolean isIndexCorrect(int index) {
        return !(index >= 0 && index < array.length);

    }

}
/*
+ Поиск элемента по значению
+ Удаление элемента по значению
+ Удаление ВСЕХ элементов, имеющих значение X;
+ Возвращение значения по индексу
+ Конструктор, принимающий в себя обычный массив и создающий RubberArray с такими де значениями
- Замена значения по индексу (есть индекс и новое значение)
- Замена значения по значению (есть старое и новое значение)
 */



/*
+ количество элементов в массиве
+ сумма элементов массива
+ добавления сразу нескольких значений в массив
+ найти мин, макс
+ получить RubberArray в виде обычного массива
+ удалить элемент по индексу
- поиск элемента по значению
- сортировать ???
- заменить по индексу значение в массиве
- среднее значение ???
- распечатать в обратной последовательности -> ???
- удалить элемент по значению

 */


