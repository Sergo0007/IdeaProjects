package HomeWork_04;

public class homework_04 {

    public static void main(String[] args) {


        String myName = "Sergej";
        int nameLength = myName.length();
        System.out.println("количество букв в моем имени:"+ nameLength);

        String Name = "Sergej";
        char firstChar = myName.charAt(0);
        char lastChar = myName.charAt(myName.length()-1);
        System.out.println("Первый символ;" + firstChar);
        System.out.println("Последний символ:" + lastChar);

        String name ="Sergej";
        int firstCharCode = name.charAt(0);
        int lastCharCode = name.charAt(name.length() -1);
        System.out.println("десятичный код первого символа:" +firstCharCode);
        System.out.println("десятичный код первого символа:"+lastCharCode);

        String str1 ="java";
        String str2 ="is";
        String str3 ="a";
        String str4 ="powerful";
        String str5 ="language";

        String str6 = str1 + " " +str2 + " " +str3 +" " +str4 +" " +str5;
        System.out.println(str6 +"length:" +str6.length());
        String result1 = str1.concat(" ").concat(str2).concat(" ").concat(str3).concat(" ").concat(str4 ).concat(" ").concat(str5);
        System.out.println(result1);
        System.out.println("длина строки:"+result1.length());

        String result ="Java is a powerful language";
        result = result.replace("powerful","super");
        boolean containsAge = result.contains("age");
        System.out.println(result);
        System.out.println("Длина строки"+result.length());
        System.out.println("Содержит подстроку 'age': " + containsAge);









    }
}
