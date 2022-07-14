package lesson9;

public class Journal extends PrintPub{
    int num;

    public Journal(){

    }

    public Journal(String name, int year, String pub, int num,int kolList) {
        super(name, year, pub,kolList);
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Journal journal = (Journal) o;

        return num == journal.num;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + num;
        return result;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "num='" + num + '\'' +
                ", name=" + super.getName() +
                ", pub=" + super.getPub() +
                ", year=" + super.getYear() +
                '}';
    }
}
