package homework_05;

import java.util.Random;

public class HomeWork_05 {
    public static void main(String[] args) {
        Random random = new Random();
        int var1 = random.nextInt(20);
        System.out.println(" var " + var1);

        boolean b1 = (var1 % 2 == 0); //остаткок от деления на 2 равен 0
        System.out.println(" число " + var1 + " кратное 3 " + b1);

        boolean b2 = (var1 % 3 == 0);//остаткок от деления на 3 равен 0
        System.out.println(" число " + var1 + " кратное 3 " + b2);

        boolean b3 = (b1) & (b2); // четное и кратное 3
        System.out.println(" число " + var1 + " четное " + b1 + " кратное 3 " + b2 + " четное и кратное " + b3);

        System.out.println("*******");

        int var2 = random.nextInt(20);
        System.out.println(" var " + var2);

        boolean c1 = (var2 % 2 == 0);//остаткок от деления на 2 равен 0
        System.out.println(" число " + var2 + " кратное 3 " + c1);

        boolean c2 = (var2 % 3 == 0);//остаткок от деления на 3 равен 0
        System.out.println(" число " + var2 + " кратное 3 " + c2);

        boolean c3 = (c1) & (c2); // четное и кратное 3
        System.out.println(" число " + var2 + " четное " + c1 + " кратное 3 " + c2 + " четное и кратное " + c3);

        System.out.println("*********");

        int var3 = random.nextInt(20);
        System.out.println(" var " + var3);

        boolean d1 = (var2 % 2 == 0);//остаткок от деления на 2 равен 0
        System.out.println(" число " + var3 + " кратное 3 " + d1);

        boolean d2 = (var3 % 3 == 0);//остаткок от деления на 3 равен 0
        System.out.println(" число " + var3 + " кратное 3 " + d2);

        boolean d3 = (d1) & (d2); // четное и кратное 3
        System.out.println(" число " + var3 + " четное " + d1 + " кратное 3 " + d2 + " четное и кратное " + d3);

        System.out.println("*********");

        int var4 = random.nextInt(20);
        System.out.println(" var " + var4);

        boolean e1 = (var2 % 2 == 0);//остаткок от деления на 2 равен 0
        System.out.println(" число " + var4 + " кратное 3 " + e1);

        boolean e2 = (var4 % 3 == 0);//остаткок от деления на 3 равен 0
        System.out.println(" число " + var4 + " кратное 3 " + e2);

        boolean e3 = (e1) & (e2); // четное и кратное 3
        System.out.println(" число " + var4 + " четное " + e1 + " кратное 3 " + e2 + " четное и кратное " + e3);

        System.out.println("*********");

        int var5 = random.nextInt(20);
        System.out.println(" var " + var5);

        boolean f1 = (var5 % 2 == 0);//остаткок от деления на 2 равен 0
        System.out.println(" число " + var5 + " кратное 3 " + f1);

        boolean f2 = (var5 % 3 == 0);//остаткок от деления на 3 равен 0
        System.out.println(" число " + var5 + " кратное 3 " + f2);

        boolean f3 = (f1) & (f2); // четное и кратное 3
        System.out.println(" число " + var5 + " четное " + f1 + " кратное 3 " + f2 + " четное и кратное " + f3);

        System.out.println("*********");

        int var6 = random.nextInt(20);
        System.out.println(" var " + var6);

        boolean g1 = (var6 % 2 == 0);//остаткок от деления на 2 равен 0
        System.out.println(" число " + var6 + " кратное 3 " + f1);

        boolean g2 = (var6 % 3 == 0);//остаткок от деления на 3 равен 0
        System.out.println(" число " + var6 + " кратное 3 " + f2);

        boolean g3 = (g1) & (g2); // четное и кратное 3
        System.out.println(" число " + var6 + " четное " + g1 + " кратное 3 " + g2 + " четное и кратное " + g3);

        System.out.println("*********");

        int var7 = random.nextInt(20);
        System.out.println(" var " + var7);

        boolean h1 = (var7 % 2 == 0);//остаткок от деления на 2 равен 0
        System.out.println(" число " + var7 + " кратное 3 " + h1);

        boolean h2 = (var7 % 3 == 0);//остаткок от деления на 3 равен 0
        System.out.println(" число " + var2 + " кратное 3 " + c2);

        boolean h3 = (h1) & (h2); // четное и кратное 3
        System.out.println(" число " + var7 + " четное " + h1 + " кратное 3 " + h2 + " четное и кратное " + h3);

        System.out.println("*********");

        int var8 = random.nextInt(20);
        System.out.println(" var " + var8);

        boolean i1 = (var8 % 2 == 0);//остаткок от деления на 2 равен 0
        System.out.println(" число " + var8 + " кратное 3 " + i1);

        boolean i2 = (var8 % 3 == 0);//остаткок от деления на 3 равен 0
        System.out.println(" число " + var8 + " кратное 3 " + i2);

        boolean i3 = (i1) & (i2); // четное и кратное 3
        System.out.println(" число " + var8 + " четное " + i1 + " кратное 3 " + i2 + " четное и кратное " + i3);

        System.out.println("*********");

        int var9 = random.nextInt(20);
        System.out.println(" var " + var9);

        boolean j1 = (var9 % 2 == 0);//остаткок от деления на 2 равен 0
        System.out.println(" число " + var9 + " кратное 3 " + j1);

        boolean j2 = (var2 % 3 == 0);//остаткок от деления на 3 равен 0
        System.out.println(" число " + var9 + " кратное 3 " + j2);

        boolean j3 = (j1) & (j2); // четное и кратное 3
        System.out.println(" число " + var9 + " четное " + j1 + " кратное 3 " + j2 + " четное и кратное " + i3);

        System.out.println("*********");

        int var10 = random.nextInt(20);
        System.out.println(" var " + var10);

        boolean k1 = (var10 % 2 == 0);//остаткок от деления на 2 равен 0
        System.out.println(" число " + var10 + " кратное 3 " + k1);

        boolean k2 = (var10 % 3 == 0);//остаткок от деления на 3 равен 0
        System.out.println(" число " + var10 + " кратное 3 " + k2);

        boolean k3 = (k1) & (k2); // четное и кратное 3
        System.out.println(" число " + var10 + " четное " + k1 + " кратное 3 " + k2 + " четное и кратное " + k3);

        System.out.println("*********");

        System.out.println(((true || false)) ^ (45 < 70) && !true ^ (6 == 5));
        System.out.println(true ^ true && false ^ false);
        System.out.println(false && false);
        System.out.println(false);


    }
}
