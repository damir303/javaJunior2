package lesson7;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.orat();

        Cat cat = new Cat(1,"����������");
        cat.orat();

        Animal slon1 = new Animal(12, "�����������");
        Animal slon2 = new Animal(13, "�����������");
        Animal slon3 = slon1;

        System.out.println(slon1.equals(slon2));

        System.out.println();
        System.out.println(cat.hashCode());

        System.out.println(slon1.toString());


    }
}
