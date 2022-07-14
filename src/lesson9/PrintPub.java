package lesson9;

public abstract class PrintPub {
    private String name;
    private int year;
    private String pub;
    private int kolList;


    public PrintPub() {

    }

    public PrintPub(String name, int year, String pub, int kolList) {
        this.name = name;
        this.year = year;
        this.pub = pub;
        this.kolList = kolList;
    }

    public int getKolList() {
        return kolList;
    }

    public void setKolList(int kolList) {
        this.kolList = kolList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        this.pub = pub;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrintPub printPub = (PrintPub) o;

        if (year != printPub.year) return false;
        if (name != null ? !name.equals(printPub.name) : printPub.name != null) return false;
        return pub != null ? pub.equals(printPub.pub) : printPub.pub == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + year;
        result = 31 * result + (pub != null ? pub.hashCode() : 0);
        return result;
    }

    @Override
    public abstract String toString();
}
