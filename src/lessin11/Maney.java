package lessin11;

public class Maney {
    private int value;
    private int year;
    private String material;
    private double diametr;
    private String gorod;

    public Maney(){

    }

    public Maney(int value, int year, String material, double diametr) {
        this.value = value;
        this.year = year;
        this.material = material;
        this.diametr = diametr;
    }

    @Override
    public String toString() {
        String s = String.valueOf(this.hashCode());
        return  s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Maney maney = (Maney) o;

        if (value != maney.value) return false;
        if (year != maney.year) return false;
        if (Double.compare(maney.diametr, diametr) != 0) return false;
        return material != null ? material.equals(maney.material) : maney.material == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = value;
        result = 31 * result + year;
        result = 31 * result + (material != null ? material.hashCode() : 0);
        temp = Double.doubleToLongBits(diametr);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
