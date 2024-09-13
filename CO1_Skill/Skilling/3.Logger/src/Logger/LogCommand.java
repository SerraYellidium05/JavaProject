package Logger;

public class LogCommand implements Command{
	 private LogLevel level;
	    private LogHandler handler;

	    public LogCommand(LogLevel level, LogHandler handler) {
	        this.level = level;
	        this.handler = handler;
	    }
	    public void execute(String message) {
	        handler.handleRequest(level, message);
	    }

}
