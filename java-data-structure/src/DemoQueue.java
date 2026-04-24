import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoQueue {
  public static void main(String[] args) {
    // ! With Ordering
    Queue<String> queue = new ArrayDeque<>(); // ! LinkedList or ArrayDeque (How to do)
    queue.add("Leo");
    queue.add("Tommy");
    queue.add("Alex");

    System.out.println(queue.peek()); // Leo, look up the head
    System.out.println(queue.remove()); // remove head

    // ! Queue -> while loop -> retrieve data
    System.out.println(queue.size()); // 2

    while (!queue.isEmpty()) {
      String head = queue.poll(); // Remove and get head
      System.out.println(head);
    }

    System.out.println(queue.size()); // 0

    // queue.remove(); // java.util.NoSuchElementException
    queue.poll(); // nothing happen


    
    List<String> strings = new ArrayList<>();
    List<String> strings2 = new LinkedList<>();
  }
}