package homework_12;

public class HomeWork_12 {
    public static void main(String[] args) {
        /*Написать метод принимающий целое число и проверяющий является ли число простым. Если является,
    метод должен вернуть true, не является - false */

        System.out.println(primeIntMethod(11));

    }

    public static boolean primeIntMethod(int x) {
        boolean res = true;

        for (int i = 2; i < x; i++) {

            if (x % i == 0) {
                res = false;//число не простое
            }
        }
        return res;

    }
}

