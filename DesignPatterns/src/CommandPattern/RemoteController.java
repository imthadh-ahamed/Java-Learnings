package CommandPattern;

public class RemoteController {
	private static RemoteController remoteController;
	
	Command onCommand;
	Command offCommand;
	
	private RemoteController() {}
	
	public RemoteController(Command onCommand, Command offCommand) {
		this.onCommand = onCommand;
		this.offCommand = offCommand;
	}
	
	public static RemoteController getInstance() {
		if (remoteController == null) {
			remoteController = new RemoteController();
		}
		return remoteController;
	}
	
	void onButtonPressed() {
		onCommand.execute();
	}
	
	void offButtonPressed() {
		offCommand.execute();
	}
}
