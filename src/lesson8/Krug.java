package lesson8;

public class Krug implements Figura, Figura3d{
    @Override
    public void printObem() {
        System.out.println("obem");

    }

    @Override
    public void printPer() {
        System.out.println("per");

    }

    @Override
    public void print3D() {
        System.out.println("3D");
    }
}
