package command;

public class NoOpsCommand implements Command {

	public NoOpsCommand() {
	}

	@Override
	public void execute() {
		System.out.println("This Button Is Disabled ! ");
	}

}
