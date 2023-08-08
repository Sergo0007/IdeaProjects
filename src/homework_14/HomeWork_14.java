package homework_14;


public class HomeWork_14 {
    public static void main(String[] args) {
        String str = "Hello,world";
        char[] charArray = str.toCharArray();
        charArray = toCharArray(charArray);
        System.out.println(charArray);

        int[] array = {0, 1, 2, 3, 4, 5, 6,};
        swap(array, 1, 5);
    }
    public static char[] toCharArray(char[] array) { // обьявдение метода toCharArray
        for (int i = 0; i < array.length; i++) { // В цикле for перебираются элементы массива array
            if (array[i] >= 'a' && array[i] <= 'z') {// условный оператор if проверяет внутри цикла
                // выполнение условия,является ли тикуший символ буквой нижнего регистра.


                array[i] = (char) (array[i] - 32);//операция преоброзования кода символа в верхний регистр
            }
        }
        String result = new String(array);
        return array;// возвращение преобразованного массива симвлов array

    }

    public static void swap(int[] array, int index1, int index2) {
        for (int num : array) {
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
            System.out.println(num + " ");

        }
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index1 >= array.length) {
            System.out.println("Индексы за пределами массива");
            return;
        }

    }

}
