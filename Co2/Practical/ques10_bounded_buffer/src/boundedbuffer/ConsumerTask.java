package boundedbuffer;

public class ConsumerTask implements Runnable {
    private BoundedBuffer buffer;

    public ConsumerTask(BoundedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 20; i++) {
                buffer.consume();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
