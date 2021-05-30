package lesson04.classwork;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main2 {
    public static void main(String[] args) {
        Queue<Human> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Human("Olga"));
        priorityQueue.add(new Human("Danil"));
        System.out.println(priorityQueue.toString());

        System.out.println(priorityQueue);
    }
}

class Human implements Comparable{
    private String  name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }

    // Если не добавить комперабл, то в мейне нельзя будет добавить больше 1 хьюмана

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}