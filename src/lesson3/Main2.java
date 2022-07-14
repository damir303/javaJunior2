package lesson3;

public class Main2 {
    public static void main(String[] args) {
        int[][] mass = new int[7][7];

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (i == j) {
                    System.out.print(mass[i][j] + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
