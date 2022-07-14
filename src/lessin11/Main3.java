package lessin11;

import java.util.ArrayList;
import java.util.Collection;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListA = new ArrayList<>();
        ArrayList<Integer> arrayListB = new ArrayList<>();

        CollectionUtils c = new CollectionUtils();
        Collection<Integer> intC = c.union(arrayListA, arrayListB);

    }
}
