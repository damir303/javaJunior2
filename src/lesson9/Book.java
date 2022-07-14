package lesson9;

public class Book extends PrintPub {
    private String autor;

    public Book() {

    }

    public Book(String name, int year, String pub, String avtor, int kolList) {
        super(name, year, pub,kolList);
        this.autor = avtor;
    }

    public String getAvtor() {
        return autor;
    }

    public void setAvtor(String avtor) {
        this.autor = avtor;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Book book = (Book) o;

        return autor != null ? autor.equals(book.autor) : book.autor == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (autor != null ? autor.hashCode() : 0);
        result = 31 * result;
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "avtor='" + autor + '\'' +
                ", name=" + super.getName() +
                ", pub=" + super.getPub() +
                ", year=" + super.getYear() +
                ", list=" + super.getKolList() +
                '}';
    }

    public static void printMaxBook(PrintPub p[]) {
        Book b = null;
        for (PrintPub pub : p) {
            if (pub instanceof Book) {

                if (b == null)
                    b = (Book) pub;
                else if (b.getKolList() < ((Book) pub).getKolList())
                    b = (Book) pub;
            }
        }
        System.out.println(b);
    }

    public static PrintPub[] sortBookAsc(PrintPub p[]) {
        for (int i = 0; i < p.length; i++) {
            for (int j = i + 1; j < p.length; j++) {
                if (((Book) p[i]).getKolList() > ((Book) p[j]).getKolList()) {
                    int l = ((Book) p[i]).getKolList();
                    ((Book) p[i]).setKolList(((Book) p[j]).getKolList());
                    ((Book) p[j]).setKolList(l);
                }
            }
        }
        return p;
    }

    public static PrintPub[] sortBookDesc(PrintPub p[]) {

        for (int i = 0; i < p.length; i++){
            for (int j = 1 + i; j < p.length; j++) {
                if (p[i].getKolList() > p[j].getKolList()) {
                    int jj = p[j].getKolList();
                    int ii = p[i].getKolList();

                    p[i].setKolList(jj);
                    p[j].setKolList(ii);
                }
            }
        }
        return p;
    }
}
