package Lesson4;

public class Ture {
    public static void getCountry(String[][] mass, String country) {
        for (int i = 0; i < mass.length; i++) {
            System.out.printf(
                    (mass[i][0] == country ?
                            "������ %s, ��������� %s, ���������� %s, ������ %s\n" : "")
                    , mass[i][0], mass[i][1], mass[i][3], mass[i][4]
            );
        }
    }

    public static void getCountry(String[][] mass, String country, int max) {
        for (int i = 0; i < mass.length; i++) {
            if (Integer.parseInt(mass[i][1]) < max)
                System.out.printf(
                        (mass[i][0] == country ?
                                "������ %s, ��������� %s, ���������� %s, ������ %s\n" : "")
                        , mass[i][0], mass[i][1], mass[i][3], mass[i][4]
                );
        }
    }
    public static void getCountrySum(String[][] mass, int minPrice, int maxPrice){
        for (int i = 0; i < mass.length; i++) {
            if (Integer.parseInt(mass[i][1]) >= minPrice &&
                    Integer.parseInt(mass[i][1]) <= maxPrice)
                System.out.printf(
                        "������ %s, ��������� %s, ���������� %s, ������ %s\n"
                        , mass[i][0], mass[i][1], mass[i][3], mass[i][4]
                );
String k = (mass.length==0)?"":"����������� ������, ����� ���� For";

            System.out.printf((Integer.parseInt(mass[i][1]) >= minPrice &&
                            Integer.parseInt(mass[i][1]) <= maxPrice?
                            "������ %s, ��������� %s, ���������� %s, ������ %s\n":"")
                    , mass[i][0], mass[i][1], mass[i][3], mass[i][4]
            );
        }
    }

    public static int summ(int a,int b){
        return a+b;
    }
    /*

��� ��� ������� � ������ ������
alphaBet ��� "[^a-zA-Z]"
content


    1)��������� ����� �� ������������
      1.1)���� @
      1.2) ������ ���� ���������
      1.3) ����� �� ������ ���� �������/����� �����, �������, ��� ������

      2)��������� ������
      2.1) ������ �� ������ ��������������� �����
      2.2) ������� 8 ��������
      2.3) ���� ���������
      2.4) ���� ������
      2.5) �� ����������
      ***2.7) ��� ������ ���� ��� ������� ������. sdfgkeeehxjsd �� ������ ����!

      3)������� ����������� ���������� �����


           */


    public void delCountry(String[][] mass, String country) {

    }

}
