package lesson04.classwork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("hello");

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(list);

        System.out.println(list1.get(0));

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);

        LinkedList<Integer> linkedList = new LinkedList<>();
        arrayList = linkedList; // не передадутся значения
        arrayList = new LinkedList<>(arrayList); // arrayList станет linkedList и значения сохранятся
        System.out.println(linkedList.toString());
        System.out.println(arrayList);

        ArrayList<String> stringArrayList = new ArrayList<>(10000);
        stringArrayList.add("hello");
        stringArrayList.add("hi");
        stringArrayList.trimToSize();
        System.out.println(stringArrayList.size());

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(10);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        System.out.println(integerArrayList.indexOf(2));

        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.add(13);
        queue.add(14);
        queue.add(15);
        queue.offer(10);
        ;

        /*
         * add()          offer()
         * element()      peek()
         * remove()       poll()
         * */


    }

}
