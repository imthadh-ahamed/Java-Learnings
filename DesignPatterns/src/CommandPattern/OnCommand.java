package CommandPattern;

public class OnCommand implements Command {
	
	Light light;
	
	public OnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.on();
	}

}
