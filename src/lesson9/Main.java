package lesson9;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Мертвые души", 1985, "Художетвенная литература", "Н.В.Гоголь", 368);
        Book b2 = new Book("Рассказы", 2010, "Художетвенная литература", "В.М.Гаршин", 235);
        Book b3 = new Book("Детство,Отрочество,Юность", 2007, "Дрофа", " Л.Н.Толстой", 309);
        Book b4 = new Book("Капитанская дочка", 1984, "Художетвенная литература", "А.С.Пушкин", 250);
        Book b5 = new Book("Пьесы", 2010, "Дрофа", "А.Н.Островский", 375);


        PrintPub p[] = new PrintPub[5];
        p[0] = b1;
        p[1] = b2;
        p[2] = b3;
        p[3] = b4;
        p[4] = b5;

        Book.printMaxBook(p);
        System.out.println();

        System.out.println();
        Book.sortBookDesc(p);
        for (PrintPub pub : p) {
            System.out.println(pub);
        }


    }
}
