package messaging;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {
    private Queue<String> buffer = new LinkedList<>();
    private int capacity;

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(String message) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait();
        }
        buffer.add(message);
        notifyAll();
    }

    public synchronized String consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait();
        }
        String message = buffer.poll();
        notifyAll();
        return message;
    }
}
