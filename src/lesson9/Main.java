package lesson9;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("������� ����", 1985, "������������� ����������", "�.�.������", 368);
        Book b2 = new Book("��������", 2010, "������������� ����������", "�.�.������", 235);
        Book b3 = new Book("�������,����������,������", 2007, "�����", " �.�.�������", 309);
        Book b4 = new Book("����������� �����", 1984, "������������� ����������", "�.�.������", 250);
        Book b5 = new Book("�����", 2010, "�����", "�.�.����������", 375);


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
