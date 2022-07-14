package Lesson4;

public class Ture {
    public static void getCountry(String[][] mass, String country) {
        for (int i = 0; i < mass.length; i++) {
            System.out.printf(
                    (mass[i][0] == country ?
                            "Страна %s, стоимость %s, добираться %s, кормят %s\n" : "")
                    , mass[i][0], mass[i][1], mass[i][3], mass[i][4]
            );
        }
    }

    public static void getCountry(String[][] mass, String country, int max) {
        for (int i = 0; i < mass.length; i++) {
            if (Integer.parseInt(mass[i][1]) < max)
                System.out.printf(
                        (mass[i][0] == country ?
                                "Страна %s, стоимость %s, добираться %s, кормят %s\n" : "")
                        , mass[i][0], mass[i][1], mass[i][3], mass[i][4]
                );
        }
    }
    public static void getCountrySum(String[][] mass, int minPrice, int maxPrice){
        for (int i = 0; i < mass.length; i++) {
            if (Integer.parseInt(mass[i][1]) >= minPrice &&
                    Integer.parseInt(mass[i][1]) <= maxPrice)
                System.out.printf(
                        "Страна %s, стоимость %s, добираться %s, кормят %s\n"
                        , mass[i][0], mass[i][1], mass[i][3], mass[i][4]
                );
String k = (mass.length==0)?"":"Заполненный массив, нужен цикл For";

            System.out.printf((Integer.parseInt(mass[i][1]) >= minPrice &&
                            Integer.parseInt(mass[i][1]) <= maxPrice?
                            "Страна %s, стоимость %s, добираться %s, кормят %s\n":"")
                    , mass[i][0], mass[i][1], mass[i][3], mass[i][4]
            );
        }
    }

    public static int summ(int a,int b){
        return a+b;
    }
    /*

все это сделать в нововм классе
alphaBet или "[^a-zA-Z]"
content


    1)проверить почту на правильность
      1.1)одна @
      1.2) должна быть однаточка
      1.3) точка не должна быть вначале/конце слова, собачки, две подряд

      2)проверить пароль
      2.1) пароль не должен соответствовать почте
      2.2) минимум 8 символов
      2.3) одна заглавная
      2.4) один символ
      2.5) на английском
      ***2.7) нне должно быть три символо подряд. sdfgkeeehxjsd не должно быть!

      3)сделать калькулятор вотдельном класе


           */


    public void delCountry(String[][] mass, String country) {

    }

}
