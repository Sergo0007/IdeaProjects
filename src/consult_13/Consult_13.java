package consult_13;

public class Consult_13 {
    public static void main(String[] args) {
        // 1. Написать метод, принимающий два массива целых чисел и проверяющий
        // равенство этих массивов (одинаковые ли они). Если они равны, метод возвращает true  если нет то false
        // {1,2,3}  {1,2,3}   -одинаковые
        // {1,2,3,4}  {1,2,3}   -разные
        // {1,2,3}  {1,3,2}   -разные
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3,4};
        System.out.println(primeIntArray( array1,array2));


    }


    public static boolean primeIntArray(int[] array1,int[]array2) {


            if (array1.length != array2.length)
                return false;
        for (int i = 0; i <array1.length ; i++) {
            if (array1[i] != array2.length){
                return false;
            }
        }
        return true;



        }

    }
