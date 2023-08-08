
package homework_13;



public class HomeWork_13 {
    public static void main(String[] args) {
        String[]strings = {"шла","Саша","по шоссе"};
        String task = "сушка";
        boolean result = searchStringArray(strings, task);
        System.out.println(strings);
        System.out.println(task);

    }
    public static boolean searchStringArray(String[]string1,String task) {

        for (int i = 0; i <string1.length ; i++) {

        } {
            if (string1.equals(task)) {
                return true;
            }
        }
        return false;



    }

}
