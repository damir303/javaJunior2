package lesson8;

public class Main {
    public static void main(String[] args) {

        Matrix m = new Matrix(4, 5);
        Matrix m2 = new Matrix(4, 5);

        Matrix m3 = (Matrix)m.add(m2);


        Matrix mm= new Matrix();

        double i = m.getValueAt(3, 8);
        if (i == -1) {
            System.out.println("������ ����� �� �������");
        }
        m.setValueAt(3,8,15);
        double val = m.getValueAt(3, 8);
        if (i == -1) {
            System.out.println("������ ����� �� �������");
        }
        else {
            if (val==15){
                System.out.println("���������");
            }
            else {
                System.out.printf("�� ���������");
            }
        }



    }
}
