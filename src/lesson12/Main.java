package lesson12;

public class Main {
    public static void main(String[] args) {

        //1) �������� ������
        //2) ����� ���������� ������
        //3) ��������� ���������

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


        System.out.println("�������� ���������");


        System.out.println("���������");

    }
}
