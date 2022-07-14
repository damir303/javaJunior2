package lesson2;

public class Main5 {
    public static void main(String[] args) {
        int[] num = new int[10];

        int val=30;
        for (int i = 0; i < num.length; i++) {
            num[i]=val;
            val += 2;
        }
    }
}
