package lesson6.shop;

public class Main {
    public static void main(String[] args) {
        Tovar tovar1 = new Tovar("�������",7000, 123321);
        Tovar tovar2 = new Tovar("�������",300, 321123);

        Otziv otz1 = new Otziv
                ("User1",5.0, "������� ������","�������");
        Otziv otz2 = new Otziv
                ("User1",4.0, "���� ������","������");


        tovar1.addOtziv(otz1);
        System.out.println();

    }
}
