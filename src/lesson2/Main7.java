package lesson2;

public class Main7 {
    public static void main(String[] args) throws InterruptedException {
        for (int i=0;i<365;i++){
            for (int j=0;j<365;j++){
                for (int k=0;k<365;k++){
                    System.out.println("Cj");
                    Thread.sleep(1000);
                }
            }
        }
    }
}
