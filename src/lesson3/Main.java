package lesson3;

public class Main {
    public static void main(String[] args) {
        char[] abcd = {'a', 'b', 'c', 'd'};
        char[] qwe = {'q', 'w', 'e'};

        char[] abcdqwe = new char[abcd.length + qwe.length];

        for (int i = 0; abcdqwe.length > i; i++) {
            if (i < abcd.length) {
                abcdqwe[i] = abcd[i];
            } else {
                abcdqwe[i] = qwe[i - abcd.length];
            }
            System.out.println(abcdqwe[i]);
        }
    }
}
