import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {
    private Queue<Integer> queue;
    private int currentNumber;

    public QueueClass() {
        queue = new LinkedList<>();
        currentNumber = 0;
    }

    public synchronized void addToQueue() {
        currentNumber++;
        queue.add(currentNumber);
        System.out.println("Queue number issued: " + currentNumber);
    }

    public synchronized void serveNext(String helpDeskName) {
        if (!queue.isEmpty()) {
            int servedNumber = queue.poll();
            System.out.println(helpDeskName + " is now serving: " + servedNumber);
        } else {
            System.out.println(helpDeskName + ": No one in the queue.");
        }
    }

    public synchronized void resetQueue(int newNumber) {
        if (newNumber >= currentNumber) {
            currentNumber = newNumber - 1;
            queue.clear();
            System.out.println("Queue has been reset. New starting number: " + (currentNumber + 1));
        } else {
            System.out.println("Invalid reset. Please select a valid number.");
        }
    }

    public void displayQueue() {
        System.out.println("\n=== Current Queue Status ===");
        System.out.println("Next Number: " + (queue.isEmpty() ? "No one in queue" : queue.peek()));
        System.out.println("Queue Size: " + queue.size());
    }
}
