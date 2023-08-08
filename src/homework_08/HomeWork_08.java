package homework_08;

import java.util.Scanner;

public class HomeWork_08 {
    public static void main(String[] args) {

        int Task = 1;
        while (Task <= 10) {
            System.out.println("Task" + Task++);
        }


        int n = 1;
        do {
            if (n % 5 == 0)
                System.out.println("Ввести на экран все  числа до 100:" + n);
            n++;

        } while (n <= 100);


        int n1 = 1;
        int var = 1;

        while (n1 <= 100 & var <= 7) {

            if (n1 % 5 == 0) {
                System.out.println("Ввести на экран только 7  чисел от 1 до 100 делятся на 5:" + n1);
                var++;
            }
            n1++;

            System.out.println(" часть 3");

            Scanner scanner = new Scanner(System.in);
            String result = "hello";
            String wordInp;

            System.out.println("Введите слово hello");
            do {
                wordInp = scanner.nextLine();
                if (wordInp.equals(result)) {
                    System.out.println(" Спасибо!");
                    break;
                } else if (!wordInp.equals(result)) {
                    System.out.println("Введите слово заново!");
                }
                System.out.println();
            } while (true);

        }

    }

}







