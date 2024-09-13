package Logger;

public class ErrorHandler  extends LogHandler{
	 protected boolean canHandle(LogLevel level) {
	        return level == LogLevel.ERROR;
	    }
	    protected void logMessage(String message) {
	        System.out.println("ERROR: " + message);
	    }

}
