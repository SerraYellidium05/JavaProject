package messaging;

public class Producer implements Runnable {
    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.produce("Message " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
