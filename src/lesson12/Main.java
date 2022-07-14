package lesson12;

public class Main {
    public static void main(String[] args) {

        //1) создался обьект
        //2) метод напечатать ошибку
        //3) закрыктие программы

        Person p = new Person();

        try {
            p.setAge(23);
            p.setName("");
        }
        catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Name");
        }

        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Age");
        }


        System.out.println("Пытаемся утановить");


        System.out.println("Закончили");

    }
}
