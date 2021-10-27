package command;

import command.main.Music;

public class MusicOffCommand implements Command {

	Music music;

	public MusicOffCommand(Music music) {
		this.music = new Music(0,0.0F);
	}

	@Override
	public void execute() {
		music.off();
	}

}
