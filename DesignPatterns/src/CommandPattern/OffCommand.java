package CommandPattern;

public class OffCommand implements Command {
	
	Light light;
	
	public OffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.off();
	}

}
