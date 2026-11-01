package DSA.DsaLabs.Lab1.task1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();

        list.add("Seat 1");
        list.add("Seat 2");
        list.add("Seat 3");
        list.add("Seat 4");

        System.out.println(list);

        list.set(1,"Reserved");

        System.out.println(list);

        Iterator<String> iterator=list.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
