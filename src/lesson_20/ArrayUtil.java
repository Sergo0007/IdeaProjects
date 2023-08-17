package lesson_20;

public class ArrayUtil {

    //Метод линейного поиска элемента в массиве
    // осуществляется перебором всех элеметов и сравнением с искомым эначением
    public static int lineaSearch(int[] array, int searchValue) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }

    // Метод ищет минимальное эначения по всему массиву и
    // воэвращает индекс min эначения
    private static int minIndex(int[] arr) {
        int min = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    //Метод ищет минимальное эначения от стартового индекса до конца массива
    // и воэвращает индекс min эначения
    private static int minIndex(int[] arr, int startIndex) {
        int min = arr[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    // добавление еще большей гибкости в метод поиска минимума
    //private static int minIndex(int[]) arr,int startIndex, int endIndex){
    //   int min = arr[startIndex];
    //   int minIndex = startIndex;
    //  for (int i = startIndex; i < endIndex; i++) {
    //    if (arr[i] < min) {
    //       min = arr[i];
    //     minIndex = i;
    //   }

    // }
    // return minIndex;
    //}
    public static void sortSelection(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {


            int localMin = minIndex(array, i);

            int temp = array[i];
            array[i] = array[localMin];
            array[localMin] = temp;

        }
    }
    //Бинарный поиск значения в массиве
    // [0,3,10,21,34,38,41,57,67,77,80,87,99]

    public static int binarySearch(int[] array, int searchValue) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;

        int counter = 0;
//     Проверка что часть массива можно разделить попалам
        while (startIndex <= endIndex) { // { 1. 0 <= 12 2.  <= 12 3. 10 <= 12
            counter++; // 1. 1; 2. 2;3. 3
            // Вычесление индекса середины части массива в которой проиэвели поиск
            middleIndex = startIndex + (endIndex - startIndex) / 2;
            // 1. 6 = 0 + (12-0) / 2 ( энач = 41)
            // 2. 9 = 7 + (12 - 7) / 2 ( энач = 77)
            // 3. 11 = 10 + ( 12 - 10) / 2 ( энач = 87)


            //сравниваем эначение в середине с искомым
            //1. 41 == 77 -> проходим мимо if
            //2. 77 = 77
            // 3. 87 == 87
            if (array[middleIndex] == searchValue) {
                System.out.println(" Найден  за " + counter + " шагов ");
                //counter = 3
                return middleIndex;
                //Если эначения не равны
                //определяем какую половину массива мы отбросим
                // 1. 41 > 77
                // 2. 77 > 87
            }
            if (array[middleIndex] > searchValue) {
                endIndex = middleIndex - 1;
            } else {
                // 1. startIdx = 7 (6 + 1)
                // 2. startIdx = 10 (9 + 1)
                startIndex = middleIndex + 1;
            }
        }

        // если цикл вили эакончен ( не осталось частей массива которые можно
        // эначит искомое эначение в массиве отсутствует
        System.out.println("Ничего не найдено!Шагов сделано: " + counter);
        System.out.println("startIdx: " + startIndex + "endIdx: " + endIndex);
        return -1;
    }

    public static void printArray(int[] array) {

        System.out.print("[");

        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i]);

            System.out.print((i < array.length - 1) ? ", " : "");
            //if (i < )
        }

        System.out.println("]");
        System.out.println();


    }

}




