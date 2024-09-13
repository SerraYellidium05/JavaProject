package Logger;

public class Main12 {

	public static void main(String[] args) {
		 LogHandler infoHandler = new InfoHandler();
	        LogHandler debugHandler = new DebugHandler();
	        LogHandler errorHandler = new ErrorHandler();
	        infoHandler.setNextHandler(debugHandler);
	        debugHandler.setNextHandler(errorHandler);
	        Logger logger = new Logger();
	        logger.addCommand(new LogCommand(LogLevel.INFO, infoHandler));
	        logger.addCommand(new LogCommand(LogLevel.DEBUG, debugHandler));
	        logger.addCommand(new LogCommand(LogLevel.ERROR, errorHandler));
	        logger.processCommands();
	        System.out.println("Testing logger:");
	        infoHandler.handleRequest(LogLevel.INFO, "This is an info message.");
	        infoHandler.handleRequest(LogLevel.DEBUG, "This is a debug message.");
	        infoHandler.handleRequest(LogLevel.ERROR, "This is an error message.");
	    }

	}

