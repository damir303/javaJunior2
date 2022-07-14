package lesson1;

public class Main {
    public static void main(String[] args) {
        int a = 7;
        int b = 9;
        int c = 6;

        if (a != b && b != c && a != c) {
            System.out.println("Разносторонний");
        }

        if (a == b && b == c && a == c) {
            System.out.println("Равносторонний");
        }
        if (a == b && a != c && b != c
                || b == c && b != a && c != a
                || a == c && a != b && c != b) {
            System.out.println("Равнобедренны");
        }
    }
}
