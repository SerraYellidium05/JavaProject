package Logger;
import java.util.List;
import java.util.Iterator;
public class CommandIterator implements Iterator<Command>  {
	 private List<Command> commands;
	    private int position = 0;
	    public CommandIterator(List<Command> commands) {
	        this.commands = commands;
	    }
	    public boolean hasNext() {
	        return position < commands.size();
	    }
	    public Command next() {
	        return commands.get(position++);
	    }
	}

