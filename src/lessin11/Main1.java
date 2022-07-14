package lessin11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();


        long alTimeStart = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(0, "qwe" + i);
        }
        long alTimeEnd = System.currentTimeMillis();
        System.out.println(alTimeEnd - alTimeStart);
        System.out.println("================");

        long llTimeStart = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(0, "qwe" + i);
        }
        long llTimeEnd = System.currentTimeMillis();
        System.out.println(llTimeEnd - llTimeStart);


        long alTimeStartGet = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayList.get(i);
        }
        long alTimeEndGet = System.currentTimeMillis();
        System.out.println(alTimeEndGet - alTimeStartGet);
        System.out.println("================");

        long llTimeStartGet = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linkedList.get(i);
        }
        long llTimeEndGet = System.currentTimeMillis();
        System.out.println(llTimeEndGet - llTimeStartGet);

        //1) for
        /*
        for (int i = 0; i < 10000; i++) {
            linkedList.add(0, "qwe" + i);
        }
         */
        //2)
        for (String s : arrayList) {
            System.out.println(s);
        }
        //3

        for (Iterator<String> str = arrayList.iterator();str.hasNext() ; ){
            System.out.println(str.next());
        }
    }
}
