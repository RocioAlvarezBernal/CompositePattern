
import java.util.ArrayList;

public class Playlist implements IComponent {

	public String playlistName;
	public ArrayList<IComponent> allPlaylist = new ArrayList<IComponent>();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}

	public void setPlaybackSpeed(float SetSpeed) {
		for (IComponent song : allPlaylist) {
			song.setPlaybackSpeed(SetSpeed);
		}
	}

	public String getName() {
		// TODO Auto-generated method stub
		return playlistName;
	}

	public void play() {
		// TODO Auto-generated method stub
		for (IComponent allsongs : allPlaylist) {
			allsongs.play();
			System.out.println("playing all song on playlist " + playlistName);

		}
	}

	public void add(IComponent component) {
		// TODO Auto-generated method stub
		allPlaylist.add(component);
	}


}