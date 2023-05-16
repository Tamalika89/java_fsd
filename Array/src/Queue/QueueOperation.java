package Queue;
import java.util.Queue;
import java.util.LinkedList;

public class QueueOperation {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(2);
        queue.add(7);
        queue.add(8);
        System.out.println("Queue: " + queue);
        int removedElement = queue.remove();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Queue after removing: " + queue);
        int frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);
        queue.add(4);
        System.out.println("Queue after adding: " + queue);

	}

}
