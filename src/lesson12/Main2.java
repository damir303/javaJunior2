package lesson12;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        boolean n = true;
        boolean a = true;
        Person p = new Person();
        while (n == true && a == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("������� ���");
            String name = scanner.nextLine();
            try {
                p.setName(name);
                n = false;
            } catch (Exception e) {
                System.out.println("�� ������ ���");
            }
            System.out.println("������� �������");
            int age = Integer.parseInt(scanner.nextLine());

            try {
                p.setAge(age);
                a = false;
            } catch (Exception e) {
                System.out.println("�� ������ �������");
            }
        }
    }
}
