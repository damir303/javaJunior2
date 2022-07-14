package Lesson5;

import java.util.Date;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Выберите фигури");
        System.out.println("1-треугольник");
        System.out.println("2-круг");
        System.out.println("3-паролелограмм");
        System.out.println("4-конус");
        System.out.println("5-овал");
        System.out.println("6-Тетраэдр");

        Scanner sc = new Scanner(System.in);
        int secFigura = sc.nextInt();

        switch (secFigura) {
            case 1:
                System.out.println("Введите А");
                int a = sc.nextInt();
                System.out.println("Введите В");
                int b = sc.nextInt();
                System.out.println("Введите С");
                int c = sc.nextInt();


                if (Treugolnik.pravilniyTreul(a, b, c)) {
                    Treugolnik tr = new Treugolnik();
                    tr.setA(a);
                    tr.setB(b);
                    tr.setC(c);

                            System.out.println("Периметр = " + tr.perimetr());
                    System.out.println("Площадь = " + tr.ploshd());

                } else {
                    System.out.println("Треугольник не правильный");
                }

                break;
            case 2:

                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("Неверное число");
        }


    }
}
