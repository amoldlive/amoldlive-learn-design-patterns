package command;

import command.main.Light;

public class LightOnCommand implements Command {

	Light light;

	public LightOnCommand(Light light) {
		this.light = new Light();
	}

	@Override
	public void execute() {
		light.on();
	}

}
