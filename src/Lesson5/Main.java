package Lesson5;

public class Main {
    public static void main(String[] args) {

        Treugolnik tr1 = new Treugolnik();
        Treugolnik tr2 = new Treugolnik();

        if (Treugolnik.pravilniyTreul(3, 4, 5)) {
            tr1.setA(3);
            tr1.setB(4);
            tr1.setC(5);

            tr2.setA(6);
            tr2.setB(7);
            tr2.setC(8);

            int a = tr1.getA();

            tr1.pravilniyTreul();


            if (tr1.perimetr() == -1)
                System.out.println("Не внесен какаято из строн");
            else
                System.out.println("Периметр = " + tr1.perimetr());

            if (tr1.ploshd() == -1)
                System.out.println("Не внесен какаято из строн");
            else
                System.out.println("Площадь = " + tr1.ploshd());

        } else
            System.out.println("не правильный треугольник");
        //System.out.println("Периметр "+ tr1.a+tr1.b+tr1.c);

    }
}
