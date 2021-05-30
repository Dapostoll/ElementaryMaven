package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arraylist = new ArrayList<>();
        arraylist.add(55);
        Iterator<Integer> iterator = arraylist.iterator();
        while (iterator.hasNext()){
            int arr = iterator.next();
            System.out.println(arr);
        }


    }
}
