package command.main;

import java.util.Arrays;

import command.Command;
import command.NoOpsCommand;

public class Alexa {

	private int slot = 3;
	private Command onCommand[];
	private Command offCommand[];

	public Alexa() {
		onCommand = new Command[slot];
		offCommand = new Command[slot];

		for (int i = 0; i < slot; i++) {
			onCommand[i] = new NoOpsCommand();
			offCommand[i] = new NoOpsCommand();

		}
	}

	// set Command
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		if (onCommand == null && offCommand == null) {
			throw new IllegalArgumentException("Command Con Not be Null");
		} else {
			this.onCommand[slot] = onCommand;
			this.offCommand[slot] = offCommand;
		}
	}

	// activate slots
	public void activateSlots(int slot) {
		onCommand[slot].execute();
	}

	// deactivate slots
	public void deactivateSlots(int slot) {
		offCommand[slot].execute();
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("\n ----------- Alexa Controller --------- ");
		sb.append("\n Slots  : "+ slot);
		
		for (int i = 0; i < slot; i++) {
			sb.append(" \n onCommand : "+onCommand[i].getClass().getSimpleName() + " \n offCommand : "+offCommand[i].getClass().getSimpleName());
		}
		
		return sb.toString();
	}
	
	// print data
	
	
}
