package Logger;

public class InfoHandler extends LogHandler {
	protected boolean canHandle(LogLevel level) {
        return level == LogLevel.INFO;
    }
    protected void logMessage(String message) {
        System.out.println("INFO: " + message);
    }

}
