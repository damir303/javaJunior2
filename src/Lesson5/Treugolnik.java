package Lesson5;

public class Treugolnik {
    private int a;
    private int b;
    private int c;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public int getC() {
        return this.c;
    }

    public int perimetr() {
        if (this.a == 0 || this.b == 0 || this.c == 0)
            return -1;
        return this.a + this.b + this.c;
    }

    public double ploshd() {
        if (this.a == 0 || this.b == 0 || this.c == 0)
            return -1;
        return Math.sqrt(this.perimetr() / 2 *
                (this.perimetr() / 2 - this.a) *
                (this.perimetr() / 2 - this.b) *
                (this.perimetr() / 2 - this.c));
    }

    public boolean pravilniyTreul() {
        if (this.a + this.b < this.c ||
                this.b + this.c < this.a ||
                this.a + this.c < this.b) {
            return false;
        }
        return true;
    }

    public static boolean pravilniyTreul(int a, int b, int c) {
        if (a + b < c ||
                b + c < a ||
                a + c < b) {
            return false;
        }
        return true;
    }

}
