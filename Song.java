
public class Song implements IComponent {
	public String songName;
	public String artist;
	public float speed = 1; // Default playback speed

	public Song(String songName, String artist) {
		this.songName = songName;
		this.artist = artist;
	}

	public void setPlaybackSpeed(float SetSpeed) {
		// TODO Auto-generated method stub
		this.speed = SetSpeed;
	}

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("playing song " + songName);
	}

	public String getName() {
		// TODO Auto-generated method stub
		return songName;
	}

	public String getArtist() {
		// TODO Auto-generated method stub
		return artist;
	}

}
