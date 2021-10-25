package command;

import command.main.Music;

public class MusicOnCommand implements Command {

	Music music;

	public MusicOnCommand(Music music) {
		this.music = new Music(0,0.0F);
	}

	@Override
	public void execute() {
		music.on();
		music.setStation(1.101f);
		music.setVolume(8);
	}

}
