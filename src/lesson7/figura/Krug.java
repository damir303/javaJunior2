package lesson7.figura;

public class Krug extends Figura {
    private int r;

    public Krug() {
    }

    public Krug(int r) {
        this.r = r;
    }

    @Override
    public void printObem() {
        System.out.println("Обьем круга: " + (2 * Math.PI * r));
    }

    @Override
    public void printPlosad() {
        System.out.println("Площадь круга:" + (Math.PI * (r * r)));
    }
}
