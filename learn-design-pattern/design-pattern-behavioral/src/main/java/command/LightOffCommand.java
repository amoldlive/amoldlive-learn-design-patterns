package command;

import command.main.Light;

public class LightOffCommand implements Command {

	Light light;

	public LightOffCommand(Light light) {
		this.light = new Light();
	}

	@Override
	public void execute() {
		light.off();
	}

}
