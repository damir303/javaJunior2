package Lesson5;

import java.util.Date;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("�������� ������");
        System.out.println("1-�����������");
        System.out.println("2-����");
        System.out.println("3-�������������");
        System.out.println("4-�����");
        System.out.println("5-����");
        System.out.println("6-��������");

        Scanner sc = new Scanner(System.in);
        int secFigura = sc.nextInt();

        switch (secFigura) {
            case 1:
                System.out.println("������� �");
                int a = sc.nextInt();
                System.out.println("������� �");
                int b = sc.nextInt();
                System.out.println("������� �");
                int c = sc.nextInt();


                if (Treugolnik.pravilniyTreul(a, b, c)) {
                    Treugolnik tr = new Treugolnik();
                    tr.setA(a);
                    tr.setB(b);
                    tr.setC(c);

                            System.out.println("�������� = " + tr.perimetr());
                    System.out.println("������� = " + tr.ploshd());

                } else {
                    System.out.println("����������� �� ����������");
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
                System.out.println("�������� �����");
        }


    }
}
