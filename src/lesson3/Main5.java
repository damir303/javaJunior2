package lesson3;

public class Main5 {
    public static void main(String[] args) {
        int[][] numbers = new int[11][11];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                if (i + j == numbers.length / 2 || i - j == numbers.length / 2
                        || i - j == -numbers.length / 2 ||
                        ((i - j == numbers.length / 2 - 1) && i != 0 && j != 0 && i != numbers.length - 1 && j != numbers.length - 1) ||
                        ((i - j == -numbers.length / 2 + 1) && i != 0 && j != 0 && i != numbers.length - 1 && j != numbers.length - 1) ||
                        ((i - j == numbers.length / 2 - 2) && i != 0 && j != 0 && i != numbers.length - 1 && j != numbers.length - 1) ||
                        ((i - j == -numbers.length / 2 + 2) && i != 0 && j != 0 && i != numbers.length - 1 && j != numbers.length - 1))

                {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
        System.out.println("~~~~~~~~~");
    }
}
