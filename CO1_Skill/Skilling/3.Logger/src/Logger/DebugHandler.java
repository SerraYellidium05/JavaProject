package Logger;

public class DebugHandler extends LogHandler {
	protected boolean canHandle(LogLevel level) {
        return level == LogLevel.DEBUG;
    }
    protected void logMessage(String message) {
        System.out.println("DEBUG: " + message);
    }

}
