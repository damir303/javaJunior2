package lesson2;

public class Main {
    public static void main(String[] args) {
        int mark=3;
        switch (mark){
            case 5:
                System.out.println("Отлично");
                break;
            case 4:
                System.out.println("Нормально");
                break;
            case 3:
                System.out.println("Не очень");
                break;
            case 2:
                System.out.println("Иди учись!");
                break;
            default:
                System.out.println("Это не оценка");

        }
    }
}
