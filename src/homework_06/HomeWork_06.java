package homework_06;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_06 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 3 :");
        int userInputInt = scanner.nextInt();
        if (userInputInt == 1) {
            System.out.println("Вы ввели 1");
        } else if (userInputInt == 2) {
            System.out.println("Вы ввели 2");
        } else if (userInputInt == 3) {
            System.out.println("Вы ввели 3");
        }
        System.out.println("********");


        int var3 = random.nextInt(100);
        int var12 = random.nextInt(100);
        int var7 = random.nextInt(100);
        int var15 = random.nextInt(100);

        System.out.println("Число 1:" + var3);
        System.out.println("Число 2:" + var12);
        System.out.println("Число 3:" + var7);
        System.out.println("Число 4:" + var15);

        int maxVar = Math.max(Math.max(var3, var12), Math.max(var7, var15));
        System.out.println("Макскисмальное число:" + maxVar);


    }
}
