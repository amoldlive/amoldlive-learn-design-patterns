package command.main;

public class Music {
	
	private int volume;
	private float station;
	
	public Music(int volume, float station) {
		super();
		this.volume = volume;
		this.station = station;
		System.out.println(" >> Music [volume=" + volume + ", station=" + station + "]");
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("setting >> Music [volume=" + volume +"]");

	}

	public float getStation() {
		return station;
	}

	public void setStation(float station) {
		this.station = station;
		System.out.println("setting >> Music [station=" + station +"]");
	}
	
	
	public void on() {
		System.out.println(" Music On ( * ) ");
		System.out.println(" >> Music [volume=" + volume + ", station=" + station + "]");
	}
	
	public void off() {
		System.out.println(" Music off ( . ) ");
	}
	
}
