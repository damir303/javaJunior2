package lesson6.shop;

public class Main {
    public static void main(String[] args) {
        Tovar tovar1 = new Tovar("Телефон",7000, 123321);
        Tovar tovar2 = new Tovar("Пылесос",300, 321123);

        Otziv otz1 = new Otziv
                ("User1",5.0, "Хороший Телфон","Советую");
        Otziv otz2 = new Otziv
                ("User1",4.0, "норм Телфон","Берите");


        tovar1.addOtziv(otz1);
        System.out.println();

    }
}
