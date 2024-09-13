package Logger;
import java.util.ArrayList;
import java.util.List;
public class Logger {
	private List<Command> commandList = new ArrayList<>();
    public void addCommand(Command command) {
        commandList.add(command);
    }
    public void processCommands() {
        CommandIterator iterator = new CommandIterator(commandList);
        while (iterator.hasNext()) {
            Command command = iterator.next();
            command.execute("");
        }
    }
}
