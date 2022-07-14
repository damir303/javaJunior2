package lessin11;

import java.util.HashSet;
import java.util.Iterator;

public class Main2 {
    public static void main(String[] args) {
        HashSet<Maney> maneys = new HashSet();
        maneys.add(new Maney(1, 2000, "Золото", 2.2));
        maneys.add(new Maney(2, 2000, "Золото", 2.0));
        maneys.add(new Maney(1, 2000, "Золото", 2.2));
        maneys.add(new Maney(1, 2005, "Золото", 2.5));
        maneys.add(new Maney(10, 2000, "Серебро", 1.2));


        System.out.println(maneys);
        /*
        for (Iterable<Maney> itr = (Iterable<Maney>) maneys.iterator();
             itr.iterator().hasNext(); ){
            itr.toString();
        }*/

        for(Iterator<Maney> itr = maneys.iterator();itr.hasNext() ; ){
            itr.next();
        }

    }
}
