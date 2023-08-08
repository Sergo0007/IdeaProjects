package homework_07;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_07 {
    public static void main(String[] args) {

        //  Scanner scanner = new Scanner(System.in);
        // System.out.println("Введите число от 1 до 3 :");
        //  int userInputInt = scanner.nextInt();
        //  int x = 3;

        //switch (userInputInt) {
        //  case 1: {
        //    System.out.println("Вы ввели 1");
        //   break;
        //  }
        //  case 2: {
        //     System.out.println(" Вы ввели 2");
        //   break;
        //    }
        //
        //       System.out.println("вторая часть марлезонского балета");

        //       System.out.println("Введите число от 1 до 7");
        //       Scanner scanner = new Scanner(System.in);
        //       int userInputInt1 = scanner.nextInt();

        //      int x1 = 7;
        //      switch (userInputInt1) {
        //          case 1: {
        //              System.out.println("Понедельник");
        //               break;
        //          }
        //          case 2: {
        //             System.out.println("Вторник");
        //             break;
        //       }
        //     case 3: {
        //        System.out.println("Среда");
        //             break;
        //         }
        //          case 4: {
        //              System.out.println("Четверг");
        //              break;
        //          }
        //         case 5: {
        //System.out.println("Пятница");
        //             break;
        //        }
        //         case 6: {
        //             System.out.println("Выходной");
        //             break;
        //         }
        //        case 7:
        //             System.out.println("Выходной");
        //             break;
        //         default:
        //             System.out.println("Похоже друг ты выбрал больше чем чмсло 7");
        //     }
        //  }

        //Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int note = random.nextInt(12);
        System.out.println(note);

        System.out.println("Ребенок принес оцкеку:" + note);
        int tvTime = 45;
        switch (note) {
            case 12:
            case 11:
            case 10:
                //изменяем тв время
                tvTime = tvTime + 60;
                System.out.println("Хорошая оценка!.):");
                System.out.println("смотри телевизор:" + tvTime + "мин");
                break;
            case 9:
            case 8:
            case 7: {
                tvTime = tvTime + 45;
                System.out.println("Нелохо.):");
                System.out.println("смотри телевизор:" + tvTime + "мин");
                break;
            }
            case 6:
            case 5:
            case 4: {
                tvTime = tvTime + 15;
                System.out.println("Можно было получше.:");
                System.out.println("смотри телевизор:" + tvTime + "мин");
                break;
            }
            case 3: {
                tvTime = tvTime - 30;
                System.out.println("очень плохо(:");
                System.out.println("смотри телевизор:" + tvTime + "мин");
                break;
            }
            case 2:
            case 1: {
                System.out.println("Ужас , сегодня без телевизора:" + tvTime + "мин");

                break;
            }
            default:
                System.out.println();

        }

    }

}











