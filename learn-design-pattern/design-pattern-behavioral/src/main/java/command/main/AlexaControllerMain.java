package command.main;

import command.LightOffCommand;
import command.LightOnCommand;
import command.MusicOffCommand;
import command.MusicOnCommand;

public class AlexaControllerMain {
	public static void main(String[] args) {
		// Alexa alexa=new Alexa();
		// System.out.println(alexa);

		Alexa alexa = new Alexa();

		Light light = new Light();
		Music music=new Music(1,101f);
		
		alexa.setCommand(0, new LightOnCommand(light), new LightOffCommand(light));
		System.out.println(alexa);

		alexa.activateSlots(0);
		alexa.deactivateSlots(0);

		alexa.setCommand(1, new MusicOnCommand(music), new MusicOffCommand(music));
		System.out.println(alexa);

		alexa.activateSlots(1);
		alexa.deactivateSlots(1);
		
		
	}
}
