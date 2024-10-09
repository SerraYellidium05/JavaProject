package boundedbuffer;

import java.util.LinkedList;
import java.util.Queue;

public class BoundedBuffer {
    private Queue<Integer> buffer = new LinkedList<>();
    private final int capacity = 10;

    public synchronized void produce(int item) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait();
        }
        buffer.add(item);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait();
        }
        int item = buffer.poll();
        notifyAll();
        return item;
    }
}
