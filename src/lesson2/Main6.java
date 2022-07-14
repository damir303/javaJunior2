package lesson2;

public class Main6 {
    public static void main(String[] args) {
        int month = 0;
        for (int i = 0; i <= 200000; i = i + 9500) {
            month++;
        }
        int years = month / 12;
        if (month % 12 != 0) {
            years++;
        }
        System.out.println(month);


    }
}
